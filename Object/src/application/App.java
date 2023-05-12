package application;

class Person {
	String name;
}

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.name = "Maria";
		person2.name = "Ana";
		
		System.out.println(person1.name);
		System.out.println(person2.name);
		
		Car car1 = new Car();
		
		car1.color = "blue";
		car1.door = 4;
		System.out.printf("%s %d\n",car1.color, car1.door);
		
		car1.turnOn();
		car1.whichColor();
		

	}

}
