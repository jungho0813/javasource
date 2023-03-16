package inheritance;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	void turnOnDmb() {
		System.out.println("채널 "+channel+" 번 DMB 방송 시작");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널 "+this.channel+" 으로 변경");
	}
	void turnOffDmb() {
		System.out.println("채널 "+channel+" 번 DMB 방송 종료");
	}
	
}
