package car;

public class Car {

	static final String brand="ferrari";
	static String model = "f2018";
	final int power;
	
	
	
	
	public Car(int power) {
		super();
		this.power = power;
	}




	public static String getModel() {
		return model;
	}




	public static void setModel(String model) {
		Car.model = model;
	}




	public static String getBrand() {
		return brand;
	}




	public int getPower() {
		return power;
	}




	@Override
	public String toString() {
		return "Car [brand=" +brand+", model="+ model + ", power=" + power + "]";
	}
	
	
	
	
	public static void brake() {
		System.out.println("car is braking");
	}
	
	
	public void  accelerate() {
		System.out.println("car is accelerating");
	}
	
}
