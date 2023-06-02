package application;

public class App {

	public static void main(String[] args) {
		
		final String  CATS_FORMAT = "Number of cats: %d\n";
		
		String catsCount = String.format(CATS_FORMAT, Cat.getCount());
		System.out.println(catsCount);
		
		
		Cat cat1 = new Cat("Fly");
		Cat cat2 = new Cat("Snow");
		Cat cat3 = new Cat("Tito");
		
		System.out.println(cat1);
		System.out.println(cat2);
		
		System.out.println(Cat.FOOD);
		
		System.out.println(cat1.getCount());
		
		System.out.println(cat1.getId());
		
		System.out.println(cat3.getId());
		
		catsCount = String.format(CATS_FORMAT, Cat.getCount());
		System.out.println(catsCount);
	}

}
