package application;

import java.util.stream.IntStream;

public class App {
	public static void main(String[] args) {

		// criar lista com tamanho determinado:
		int[] numbers = new int[3];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int[] num = null;
		num = new int[2];
		for(int n: num) {
			System.out.println(n);
		}
		

	}
}
