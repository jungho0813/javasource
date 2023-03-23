package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class DeptMain {
	public static void main(String[] args) {
		DeptDao dao = new DeptDao();
		Scanner sc = new Scanner(System.in);
		//하나 조회
		
		System.out.println();
		//전체 조회
		dao.getRows();
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("=================");
			System.out.println(" 1. 특정부서 조회");
			System.out.println(" 2. 전체부서 조회");
			System.out.println(" 6. 종료");
			System.out.println("=================");
			
			System.out.println("메뉴입력 >> ");
			int no = sc.nextInt();
			switch (no) {
			case 1:	
				System.out.println("부서코드 입력 >>");
				int depteno = sc.nextInt();
				
				DeptDTO row = dao.getRow(depteno);
				//DeptDTO 출력
				System.out.println(row);
				break;
			case 2:
				ArrayList<DeptDTO> list = dao.getRows();
				for (DeptDTO deptDTO : list) {
					System.out.print(deptDTO.getDeptno());
					System.out.print(deptDTO.getDname());
					System.out.print(deptDTO.getLoc());
				}
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("번호를 다시 입력해 주세요");
				break;
			}
		}

	}

}
