package application;

public class Cat {
	private String name;
	private int id;
	public static final String FOOD = "rice";
	public static int count;
	
	static double averageHeight = 222;
	
	static {
		System.out.println("hello");
		System.out.println(averageHeight);
	};

	public Cat(String name) {
		this.name = name;
		this.id = count;
		
		count++;
	}
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
	public static int getCount() {
		return count;
	} 
	
	public String getId() {
		return String.format("ID: %d",id);
	}
	
	

}
