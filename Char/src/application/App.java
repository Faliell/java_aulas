package application;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		int[] lista = {2,4,6,8};
		
		Random random = new Random();
		
		int choice = random.nextInt(10);
		System.out.println(choice);
		
		int choice2 = lista[random.nextInt(lista.length)];
		System.out.println(choice2);

	}

}
