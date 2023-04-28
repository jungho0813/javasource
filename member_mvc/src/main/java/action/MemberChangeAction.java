package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.ChangeDTO;
import domain.MemberDTO;
import service.MemberChangeService;
import service.MemberLoginService;

public class MemberChangeAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post
		ChangeDTO dto = new ChangeDTO();
		dto.setUserid(request.getParameter("userid"));
		dto.setCurrentPassword(request.getParameter("currentPassword"));
		dto.setNewPassword(request.getParameter("newPassword"));
		dto.setConfirmPassword(request.getParameter("confirmPassword"));
		// userid와 현재비밀번호를 가지고 일치하는 회원이 있는지 확인
		MemberLoginService loginservice = new MemberLoginService();
		MemberDTO info = loginservice.login(dto.getUserid(), dto.getCurrentPassword());
		String path = "";
		
		if(info !=null) {
			
		// 일치한다면 비밀번호 변경 서비스 호출 => 성공시 세션 해제후 로그인페이지로 이동
			MemberChangeService changeService = new MemberChangeService();
			if(changeService.changePwd(dto)) {
				HttpSession session = request.getSession();
				session.invalidate();
				path = "login.jsp";
			}
		}else {
			
		// 일치하지 않는다면 비밀번호 변경 페이지로 되돌아가기
			path = "changePwd.jsp";
		
		}
		return new ActionForward(true,path);
	}

}
