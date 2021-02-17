
public class Car {

	private String colour;
	private String brand;
	private double price;
	private String licensePlate;
	private int speed = 32;

	
	//Constructor
	public Car() {
		this.colour = "Blue";
		this.brand = "Ford";
		this.price = 3000.00;;
		this.licensePlate = "SDF4444";
	}
	
	public Car(String colour, String brand, double price, String licencePlate) {
		this.colour = colour;
		this.brand = brand;
		this.price = price;
		this.licensePlate = licensePlate;
	}


	public boolean accelerate() {
		if (speed >= 50) {
			System.out.println("You are going to fast");
		} else {
			System.out.println("Congrats, right speed");
		}
		return false;
	}

	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getLicensePlate() {
		return licensePlate;
	}


	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	
}