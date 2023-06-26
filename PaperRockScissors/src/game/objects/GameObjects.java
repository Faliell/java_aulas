package game.objects;

public class GameObjects {
	private int id;
	private String name;
	
	private int[][] comparision = {
			/* rock paper scissors */
			/* rock     */{0,0,0},
			/* paper    */{0,0,0},
			/* scissors */{0,0,0}	
	};
	
	
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
