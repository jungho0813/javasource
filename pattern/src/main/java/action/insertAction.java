package action;

import javax.servlet.http.HttpServletRequest;

public class insertAction implements Action{

	@Override
	public void execute(HttpServletRequest request) throws Exception {
		System.out.println("이름 "+request.getParameter("name"));
		
	}

}
