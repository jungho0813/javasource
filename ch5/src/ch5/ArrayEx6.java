package ch5;

public class ArrayEx6 {
	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for (int i = 0; i < 6; i++) {
			int n = (int)(Math.random()*45);
			int temp = ball[i];
			ball[i] = ball[n];
			ball[n] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i]+" ");
		}
		
		
		
		
		
		
		
		
		
	}	

}