package application;

public class App {

	public static void main(String[] args) {
		Cat[] cats = {new HomeCat(), new Tiger()};
		
		for(Cat cat: cats) {
			cat.vocalize();
		}

	}

}
