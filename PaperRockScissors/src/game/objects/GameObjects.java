package game.objects;

public class GameObjects {
	private int id;
	private String name;
	
	private int[][] comparision = {
			/* rock paper scissors */
			/* rock     */{ 0,-1, 1},
			/* paper    */{ 1, 0,-1},
			/* scissors */{-1, 1, 0}	
	};
	
	public int compareTo(GameObjects other) {
		return comparision[id][other.id];
	}
	
	
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
