package application;

public class App {

	public static void main(String[] args) {
		Cat[] cats = {new HomeCat(), new Tiger()};
		
		for(Cat cat: cats) {
			cat.vocalize();
		}
		
		Cat cat1 = new HomeCat();
		
		//cat1.purr(); not working
		
		((HomeCat)cat1).purr();

	}

}
