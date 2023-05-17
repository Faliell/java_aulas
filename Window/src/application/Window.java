package application;

public class Window {
	int height;
	int length;
	String material;
	boolean closed;
	
	void closeOpen() {
		closed = !closed;
		System.out.println(closed);
	}
	
	
}
