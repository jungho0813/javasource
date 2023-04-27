package book.service;

import java.util.List;

import book.domain.BookDTO;
import book.persistence.BookDAO;

// ~~service : 비즈니스 로직 처리
// 비즈니스로직 : insert, update, delete, select 처리를 위한 메소드 호출

public class BordListService {
	public List<BookDTO> list() {
		BookDAO dao = new BookDAO();
		List<BookDTO> list =  dao.getList();
		
		return list;
	}
}
