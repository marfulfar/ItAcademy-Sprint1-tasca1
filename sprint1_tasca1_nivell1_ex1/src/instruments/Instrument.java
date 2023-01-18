package instruments;

public abstract class Instrument {

	private String name;
	private float price;
	
	{
		System.out.println("classe instruments iniciada per inicialització");
	}
	
	
	public Instrument(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	



	@Override
	
	public String toString() {
		return "Instrument [name=" + name + ", price=" + price + "]";
	}
	
	
	public abstract void play();
	
	
	
	
}
