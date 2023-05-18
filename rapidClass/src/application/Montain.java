package application;

public class Montain {
	
	private double size;
	private String name;
	
	public Montain(double size, String name) {
		this.size = size;
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		return "Montain [size=" + size + ", name=" + name + "]";
	}
	
	
	
	
	
	
	

}
