package phone;

public class Smartphone extends Phone implements Camera, Clock{

	public Smartphone(String brand, String model) {
		super(brand, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		
		System.out.println("Alarm ringing!");
		
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
	
		System.out.println("Taking picture!");
	}

}
