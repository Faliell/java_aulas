package application;

public class Cat {
	private String name;
	private int id;
	public static final String FOOD = "rice";
	public static int count;

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
	
	public int getId() {
		return id;
	}
	
	

}
