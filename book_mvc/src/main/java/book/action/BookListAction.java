package book.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import book.domain.BookDTO;
import book.service.BordListService;

public class BookListAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		//get or post 넘어오는 내용 가져오기(X)
		
		//service를 통해 데이터베이스 작업
		BordListService service = new BordListService();
		List<BookDTO> list = service.list();
		request.setAttribute("list", list);
		
		return new BookActionForward(false,"list.jsp");
	
	}

}
