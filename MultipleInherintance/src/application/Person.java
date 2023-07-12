package application;

public class Person implements Greater, Speaker{

	@Override
	public void speak() {
		System.out.println("I m a person");
		
	}

	@Override
	public void great() {
		System.out.println("hello");
		
	}

}
