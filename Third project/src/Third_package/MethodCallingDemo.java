package Third_package;

public class MethodCallingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.width = 10;
		box1.height = 10;
		box1.depth = 10;
		
		box2.width = 20;
		box2.height = 20;
		box2.depth = 20;
		
		box1.volume();
		box2.volume();
	}
	

}
