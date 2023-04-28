package service;

import persistence.MemberDAO;

public class MemberLeaveService {
	public boolean leave(String userid,String password) {
		return new MemberDAO().leave(userid, password);
	}
}
