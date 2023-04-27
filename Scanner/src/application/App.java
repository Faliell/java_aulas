package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write a number: ");
		
		double number = scanner.nextFloat();
		scanner.close();

		System.out.println(number);
	}

}
