package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String pass = "abc";
		Scanner scanner = new Scanner(System.in);
		boolean correct = false;
		
		while (correct == false) {
			
			System.out.println("Write a Password: ");
			String tryPass = scanner.nextLine();
			System.out.println(tryPass);
			
			if(pass.equals(tryPass)) {
				correct = true;
			}
			else{
				System.out.println("Incorrect!!!");
			}
			
		}
		System.out.println("Correct!!!");
		scanner.close();
		
	}

}
