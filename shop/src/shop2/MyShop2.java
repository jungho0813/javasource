package shop2;

import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop{
	
	//쇼핑몰 이름
	private String title;
	//user 정보 저장 배열

	//선택된 user 저장 
	private int selUser;
	
	//UserDAO 객체 생성
	UserDAO userDAO = new UserDAO();
	ProductDAO productDAO = new ProductDAO();
	OrderDAO orderDAO = new OrderDAO();
	
	Scanner sc = new Scanner(System.in);	

	@Override
	public void setTitle(String title) {		
		this.title = title;
	}

	@Override
	public void genUser() {			
		// user 정보 입력받아서 suser 테이블에 저장
		System.out.println("***** User 입력 *****");
		//userId,name,payNo 를 입력받기
		System.out.print("userid >> ");
		int userId = Integer.parseInt(sc.nextLine());
		System.out.print("name >> ");
		String name = sc.nextLine();
		System.out.print("payNo >> ");
		int payNo = Integer.parseInt(sc.nextLine());		
		
		System.out.println(userDAO.insert(userId,name,payNo)?"user 추가 성공":"user 추가 실패");	
	}
	
	public void userList() {
		
		System.out.println("***** User 목록 *****");
		System.out.println("userId\tname\tpayNo");
		System.out.println("-------------------------------");
		List<UserDTO> list = userDAO.getList();
		for (UserDTO userDTO : list) {
			System.out.print(userDTO.getUserId()+"\t");
			System.out.print(userDTO.getName()+"\t");
			System.out.println(userDTO.getPayNo()+"\n");
		}
	}
	

	@Override
	public void genProduct() {		
		// 상품 정보 입력받아서 테이블 저장
		System.out.println("***** 상품 입력 *****");
		
		// 상품정보 입력받기 => ProductDTO에 담기
		System.out.print("product_id >> ");
		int productId = Integer.parseInt(sc.nextLine());
		System.out.print("pname >> ");
		String pname = sc.nextLine();
		System.out.print("price >> ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("content >> ");
		String content = sc.nextLine();
		ProductDTO dto = new ProductDTO(productId, pname, price, content);
		
		System.out.println(productDAO.insert(dto)?"상품 추가 성공":"상품 추가 실패");
		
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("===========================================");
		
		// 전체 user 정보 출력
		List<UserDTO> list = userDAO.getList();
		for (UserDTO userDTO : list) {
			System.out.print(userDTO.getUserId()+"\t");
			System.out.print(userDTO.getName()+"\t");
		//	System.out.print(userDTO.getPayNo()+"\t");
			System.out.print(userDTO.getType()+"\n");
		}
		
		System.out.println("[x] 종   료");
		System.out.print("선택 : ");
		String sel = sc.nextLine(); // 숫자( "1001" ), x
		
		System.out.println("## "+sel+" 선택 ##");
		System.out.println();
		
		// 0,1 => productList() 호출
		// 다른걸 입력 시 => 메뉴를 확인해 주세요
		switch (sel) {
		case "x": case "X":
			System.exit(0);  //프로그램 종료
			break;
		case "1000": case "1001":
			selUser = Integer.parseInt(sel);
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해 주세요\n");
			start();
			break;
		}		
	}
	
	public void productList() {
		System.out.println();
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("========================================");
		
		//product 데이터베이스 상품 출력
		//product_id, pname, price, content
		List<ProductDTO> list= productDAO.getList();
		for (ProductDTO productDTO : list) {
			System.out.print(productDTO.getProductId()+"\t");
			System.out.print(productDTO.getPname()+"\t");
			System.out.print(productDTO.getPrice()+"\t");
			System.out.print(productDTO.getContent()+"\n");
		}		
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		
		
		String sel = sc.nextLine();
		// 상품선택 시 => sorder 저장, productList() 호출
		// h => start 메소드 호출, c => checkOut() 호출
		switch (sel) {
		case "1000":case "1001":case "1002":case "1003":
			
			orderDAO.insert(selUser,Integer.parseInt(sel));				
			productList();
			break;
		case "h": case "H":
			start();
			break;
		case "c": case "C":
			checkOut();
			break;
		default:
			System.out.println("입력값을 확인해 주세요");
			productList();
			break;
		}		
	}
	
	public void checkOut() {
		System.out.println(title + " : 체크아웃");
		System.out.println("========================================");
		
		//carts 출력
		int total = 0; //제품 가격 합계
		List<OrderDTO> list = orderDAO.carts(selUser);
		System.out.println("아이디 이름 결제방법 제품번호 제품명 가격 상세내용 주문일자");
		for (OrderDTO orderDTO : list) {
			System.out.print(orderDTO.getUserDTO().getUserId()+"\t");
			System.out.print(orderDTO.getUserDTO().getName()+"\t");
			System.out.print(orderDTO.getUserDTO().getType()+"\t");
			System.out.print(orderDTO.getProductDTO().getProductId()+"\t");
			System.out.print(orderDTO.getProductDTO().getPname()+"\t");
			System.out.print(orderDTO.getProductDTO().getPrice()+"\t");
			System.out.print(orderDTO.getProductDTO().getContent()+"\t");
			System.out.print(orderDTO.getOrderDate()+"\n");
			
			total += orderDTO.getProductDTO().getPrice();
		}
		
		System.out.println("========================================");
		//System.out.println("결제 방법 : "+users[selUser].getPayType());
		System.out.println("결제 금액 : "+total);
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
		
		// p 일 때 productList() 호출
		// q 일 때 결제가 완료되었습니다. 프로그램 종료
		// 잘못입력 시 checkOut() 호출
		switch (sel) {
		case "p": case "P":
			productList();
			break;
		case "q": case "Q":
			System.out.println("결제가 완료되었습니다.");
			System.exit(0);
			break;
		default:
			checkOut();
			break;
		}
	}
}


