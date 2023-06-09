package game.objects;

public class GameObjects {
	private int id;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "GameObjects [id=" + id + ", name=" + name + "]";
	}
	
	
}
