package application;

public class Person {
	
	public Person(){
		name = "?";
		age = 0;
		System.out.println("Person created");
	}
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
