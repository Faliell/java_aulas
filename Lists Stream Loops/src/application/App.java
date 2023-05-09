package application;

import java.util.stream.IntStream;

public class App {
	public static void main(String[] args) {

		int[] numbers = { 1, 4, 5, 2, 7 };

		System.out.println(numbers[0]);

		String[] words = { "apple", "banana", "mango" };

		System.out.println(words[0]);

		// iterate:

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		// iterate stream:
		IntStream.range(0, words.length).forEach(i -> {
			System.out.printf("%d. %s %n", i + 1, words[i]);
		});
		
		//iterate for:
		
		for(String word: words) {
			System.out.println(word);
		}

	}
}
