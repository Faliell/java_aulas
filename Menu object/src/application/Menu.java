package application;

public class Menu {
	String[] options = {"View Data Base","Add new Item", "Delete Item", "Quit Program"};
	
	void display() {
		for(int i = 1; i<=options.length;i++) {
			System.out.printf("%d. %s\n", i, options[i-1]);
		}
		
	}
}
