package ch6;


public class Member {

		// 아이디 userid ex)hong123
		String userid;
		// 비밀번호 password ex)hong123@!
		String password;
		// 비밀번호확인 confirmPassword ex)hong123@!
		String confirmPassWord;
		// 전화번호 hp ex)01000000000
		String hp;
		// 주소 address ex)서울
		String address;
		public Member(String userid, String password, String confirmPassWord, String hp) {
			super();
			this.userid = userid;
			this.password = password;
			this.confirmPassWord = confirmPassWord;
			this.hp = hp;
		}
		public Member(String userid, String password, String confirmPassWord, String hp, String address) {
			super();
			this.userid = userid;
			this.password = password;
			this.confirmPassWord = confirmPassWord;
			this.hp = hp;
			this.address = address;
		}

		boolean passwordAndConfirmPasswordEquals() {
			//문자열비교
			//equals() t/f
			return password.equals(confirmPassWord);
		}



}
