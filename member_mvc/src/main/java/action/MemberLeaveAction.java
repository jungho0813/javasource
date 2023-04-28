package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import service.MemberLeaveService;

public class MemberLeaveAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		MemberLeaveService service = new MemberLeaveService();
		boolean leaveFlag = service.leave(userid, password);
		// 탈퇴 성공시 세션해제 index.jsp이동
		String path="";
		if(leaveFlag) {
			HttpSession session = request.getSession();
			session.invalidate();
			path="index.jsp";
		}else {
			path = "leave.jsp";
		}
		
		// 실패시 leave.jsp 이동
		return new ActionForward(true,path);
	}

}
