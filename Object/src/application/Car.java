package application;

public class Car {
	String color = "red";
	int door;
	
	void turnOn() {
		System.out.println("vrummm");
	}
	
	void whichColor() {
		System.out.printf("The color is %s\n", color);
	}
}
