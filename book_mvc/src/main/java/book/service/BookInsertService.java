package book.service;

import book.domain.BookDTO;
import book.persistence.BookDAO;

public class BookInsertService {
	
	public boolean insertBook(BookDTO insertDto) {
		
		BookDAO dao = new BookDAO();
		return dao.insert(insertDto);
		
	}
}
