package application;

public class Menu {
	String[] options = {"View Data Base","Add new Item", "Delete Item", "Quit Program"};
	String menu = "";
	String display() {
		for(int i = 1; i<=options.length;i++) {
			menu += String.format("%d. %s\n",i, options[i-1]);
		}
		return menu;
	}
}
