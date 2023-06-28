package application;

public class Person {

	private String name;
	
	public Person(String name) {
		System.out.println("person constructor");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
