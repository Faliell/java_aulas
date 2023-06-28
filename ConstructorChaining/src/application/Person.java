package application;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		this("not supplied", 0);	
	}
	
	public Person(String name) {
		this(name, 0);
	}
	
	public Person(int age) {
		this("not supplied", age);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("call this");
	}
	
	public String toString() {
		return name + ", " + age;
	}
	
}
