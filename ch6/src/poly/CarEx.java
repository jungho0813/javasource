package poly;

public class CarEx {
	public static void main(String[] args) {
//		Car car1 = new FireEngine();		
//		Car car2 = new Ambulance();

		Car car = null;
		
		FireEngine fireEngine = new FireEngine();
		FireEngine fireEngine2 = null;
		
		fireEngine.water();
		car = fireEngine; // Car car = new FireEngine();
		
		fireEngine2 = (FireEngine) car; // 강제 형변환(캐스팅)
		fireEngine2.water();
		
		FireEngine fe = (FireEngine) new Car();
		fe.drive();
		
		
	}
}
