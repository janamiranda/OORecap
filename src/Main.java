
public class Main {

	public static void main(String[] args) {


		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("Jana");
		
		System.out.println(p1.name);
		System.out.println(p2.getName());

		
		System.out.println(p1);
	
		Car c1 = new Car();
		
		c1.getColour();
		System.out.println(c1.getColour());
		c1.setColour("Green");
		
		System.out.println(c1.getColour());

		System.out.println(c1.accelerate());
	

	}
}

