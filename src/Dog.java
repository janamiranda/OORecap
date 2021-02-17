
public class Dog {

	String name;
	String color;
	String address;

	
	//Constructor
	public Dog() {
		this.name = "Blue";
		this.color = "Ford";
		this.address = "Henry Street";
		this.isVacinated = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
