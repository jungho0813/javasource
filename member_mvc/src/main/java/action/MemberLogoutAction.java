package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MemberLogoutAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get, post (X)
		// service (X)
		
		// session 해제
		HttpSession session = request.getSession();
		session.removeAttribute("loginDto");
		// actionForward : index.jsp
		return new ActionForward(true,"index.jsp");
	}

}
