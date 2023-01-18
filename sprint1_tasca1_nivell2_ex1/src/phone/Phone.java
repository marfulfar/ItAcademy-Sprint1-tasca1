package phone;

public class Phone {
	
	private String brand;
	private String model;
	
	
	
	public Phone(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	
	
	public void call(String phoneNum) {
		
		System.out.println("Calling " + phoneNum);
		
	}
	
	
	

}
