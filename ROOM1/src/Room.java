enum Floor{
	hardWood,
	carpeting,
	tiled
	
}
public class Room {
	private String wall="";
	private Floor floor;
	private int window=0;
	public Room()
	{}
	public Room(String wall,int window,Floor floor)
	{
		this.wall=wall;
		this.window=window;
		this.floor=floor;
	}
	
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	public Floor getFloor() {
		return floor;
	}
	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	public int getWindow() {
		return window;
	}
	public void setWindow(int window) {
		this.window = window;
	}
	public void print()
	{
		System.out.println("Wall color: "+wall+" Floor type: "+floor+" window number: "+window);
	}
	

}

