package ch3;

public class SwitchEx1 {

	public static void main(String[] args) {
	   // switch : if~else if~else 대신 사용
//       switch (key) {
//	case value:		
//		break;
//	case value:		
//		break;
//	case value:		
//		break;
//	default:
//		break;
//	}
		

		int month=3;
		
		switch (month) {
		case 3:	case 4:	case 5:
			System.out.println("현재 계절은 봄");
			break;
		case 6:	 case 7:	case 8:
			System.out.println("현재 계절은 여름");
			break;
		case 9:	 case 10:	case 11:
			System.out.println("현재 계절은 가을");
			break;
		case 1:	 case 12:	case 2:
			System.out.println("현재 계절은 겨울");
			break;
		}
		
		
	}

}
