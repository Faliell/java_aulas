package application;

public class App {

	public static void main(String[] args) {
		Calculator result = new Calculator();
		int num = result.square(2);
		System.out.println(num);
		
		int soma = result.add(3,4);
		System.out.println(soma);
		
		int sub = result.sub(6,5);
		System.out.println(sub);
		
		int multi = result.multi(soma, sub);
		System.out.println(multi);
	}

}
