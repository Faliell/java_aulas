package application;

public class App {

	public static void main(String[] args) {
		Animal a1 = new Cat();
		a1.speak();
		((Cat) a1).jump();
		Cat a2 = (Cat) a1;
		a2.jump();
		a2.speak();
	}

}
