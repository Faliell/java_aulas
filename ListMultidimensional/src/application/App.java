package application;

public class App {

	public static void main(String[] args) {
		String[][] text = {
				{ "one", "two", "three" },
				{ "four", "five", "six" },
				{ "seven", "eight", "nine" } 
			};

		for(int i = 0; i < text.length; i++) {
			String[] substring = text[i];

			for(int j = 0; j < text.length; j++) {
				System.out.printf("%s\t", substring[j]);	
			}
			System.out.println();

		}

	}

}
