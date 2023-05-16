package application;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.setName("Fabio");
		person1.setAge(42);
		System.out.println(person1.name);
		System.out.println(person1.age);

	}

}
