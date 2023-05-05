package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		final String pass = "abc"; // final = constante
		Scanner scanner = new Scanner(System.in);
		boolean correct = false; // = FLAG 
		
		for (int i = 0;i < 3; i++) {
			
			System.out.println("Write a Password: ");
			String tryPass = scanner.nextLine();
			System.out.println(tryPass);
			
			if(pass.equals(tryPass)) {
				correct = true;
			}
			else{
				System.out.println("Incorrect!!!");
			}
			if(correct) {
				break;
			}
			
		}
		if(correct) {
			System.out.println("Correct!!!");
		}else {
			System.out.println("No more chance!");
		}
		
		
		scanner.close();
		
	}

}
