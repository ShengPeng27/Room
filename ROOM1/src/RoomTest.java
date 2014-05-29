
public class RoomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room myRoom1=new Room();
		myRoom1.setFloor(Floor.carpeting);
		System.out.println(myRoom1.getFloor());
		myRoom1.setWall("Red");
		System.out.println(myRoom1.getWall());
		myRoom1.setWindow(4);
		System.out.println(myRoom1.getWindow());
		myRoom1.print();
		Room myRoom2=new Room("Blue",5,Floor.hardWood);
		myRoom2.print();
	}

}
