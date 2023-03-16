package ch6;

public class Car3 {
	String company;
	String model;
	String color;
	int maxSpeed;
	
		
	public Car3() {
		super();
	}
	


	public Car3(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}



	@Override
	public String toString() {
		return "Car3 [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
	

}
