package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva um numero ");
		int input = scanner.nextInt();
		scanner.close();
		
		if(input == 1) {
			System.out.println("um");
		}
		else if(input == 2) {
			System.out.println("sair");
			System.exit(0);
			//não vai exibir
			System.out.println("aaaaaaaaaaa");
		}
		else {
			System.out.println("outro numero");
		}
		
		
		// One line if
		
		boolean isRaining = true;
		
		if(isRaining)
			System.out.println("guarda-chuva");
		else
			System.out.println("sol");
		
		
	}

}
