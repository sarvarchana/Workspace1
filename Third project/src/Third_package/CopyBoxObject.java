package Third_package;

public class CopyBoxObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box1 = new Box();
		Box box2 = box1;
		
		box1.height = 100;
		
		System.out.println(box2.height);
		
	}

}
