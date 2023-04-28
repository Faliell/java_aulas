package application;

public class App {

	public static void main(String[] args) {
		int count = 0;
		count = count + 1;
		count += 1;
		count++; // soma na proxima vez que chamar a variavel
		++count; // soma na mesma linha
				
		
		int banana = 3;
		int apple = 2;
		int fruits = ++banana + apple++;
		System.out.println(fruits);
		System.out.println(apple);
		
		int lion = 4;
		int animals = lion++; //recebe 4 e depois soma
		System.out.println(animals);
		
		int tiger = 5;
		int cats = tiger++ + tiger;
		System.out.println(cats);
	}

}
