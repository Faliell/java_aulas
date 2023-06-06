package application;

public class App {

	public static void main(String[] args) {
		boolean isRaining = true;
		boolean haveUmbrella = true;
		
		boolean takeUmbrella = false;
		
		// && and
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		}
		
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		
		
		System.out.println(takeUmbrella);
		
		// or ||
		if(isRaining || haveUmbrella) {
			takeUmbrella = true;
		}
		//ternary
		takeUmbrella = isRaining || haveUmbrella;
		
		System.out.println(takeUmbrella);
	}

}
