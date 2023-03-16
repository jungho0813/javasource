package thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		SmallLetters t1 = new SmallLetters();
		BigLetters t2 = new BigLetters();
		Thread t3 = new Thread(new NumPrint());
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
