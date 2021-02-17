
public class Person {

	int age;
	String gender;
	String name;

	// Default constructor
	public Person() {
		this.age = 18;
		this.gender = "female";
		this.name = "Almicar";
	}

	public Person(int age, String gender, String name) {
		this.age = age;
		this.gender = gender;
		this.name = name;

	}

	public String run() {
		return this.name + " is running";
	}

	public String walk() {
		return this.name + " is walking";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + " Gender: " + this.gender + " Age: " + this.age; 
	}

}
