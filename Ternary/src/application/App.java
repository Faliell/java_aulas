package application;


public class App {

	public static void main(String[] args) {
		
		System.out.println(true ? "yes": "no");
		
		int value = 300;
		
		value = value > 40 ? value : 40;
		
		System.out.println(value);
		
		int[] lista = { 33,4,55,6,77};
		
		int min = Integer.MAX_VALUE;
		
		for(int i: lista) {
			min = min > i ? i : min;
		}
		System.out.println(min);
	}

}
