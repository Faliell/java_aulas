package application;

public class App {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Fly");
		Cat cat2 = new Cat("Snow");
		
		System.out.println(cat1);
		System.out.println(cat2);
		
		System.out.println(cat1.FOOD);
		
		System.out.println(cat1.getCount());
		
		System.out.println(cat1.getId());
	}

}
