package application;

public class App {

	public static void main(String[] args) {
		String[][] text = {
				{ "one", "two", "three" },
				{ "four", "five", "six" },
				{ "seven", "eight", "nine" } 
			};

		System.out.println(text[1][1]);
		
		text[1][1] = "blue";
		
		for(int i = 0; i < text.length; i++) {

			for(int j = 0; j < text[i].length; j++) {
				System.out.printf("%s\t", text[i][j]);	
			}
			System.out.println();

		}
		
		int [][] numbers = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0;i<numbers.length;i++) {
				System.out.println(numbers[i][i]);
		}
		

	}

}
