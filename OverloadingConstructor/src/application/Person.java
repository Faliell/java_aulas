package application;

public class Person {
	
	
	private String name;


	public Person() {
		System.out.println("New Person created");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println(this.name);
	}
	
	
	@Override
	public String toString() {
		return "hello";
	}

}
