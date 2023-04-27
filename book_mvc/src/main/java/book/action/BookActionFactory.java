package book.action;

public class BookActionFactory {
	public static BookActionFactory baf;
	private BookActionFactory() {}
	public static BookActionFactory getInstance() {
		if(baf == null) {
			baf = new BookActionFactory();
		}
		return baf;
	}
	
	public BookAction action(String cmd) {
		BookAction action = null;
		if(cmd.equals("/list.do")) {
			action = new BookListAction();
		}else if(cmd.equals("/insert.do")) {
			action = new BookInsertAction();
		}
		
		
		
		return action;
	}
}
