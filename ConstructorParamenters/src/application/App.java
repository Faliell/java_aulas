package application;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		Person person2 = new Person("ana", 11);
		
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		System.out.println(person2.getName());
		System.out.println(person2.getAge());

	}

}
