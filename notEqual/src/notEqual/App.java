package notEqual;

public class App {
	public static void main(String[] args) {
		
		// ! not unary operator;
		
		int value1 = 3;
		int value2 = 4;
		
		System.out.println(value1 != value2);
		
		String fruit1 = "banana";
		String fruit2 = "banana";
		
		System.out.println(fruit1 == fruit2);
		System.out.println(!fruit1.equals(fruit2));
	}
}
