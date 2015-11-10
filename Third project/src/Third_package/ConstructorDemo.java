package Third_package;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box1 = new Box(10,10,10);
		Box box2 = new Box(20,20,20);
		
		System.out.println("the volume of the box1 is "+box1.volume());
		
		System.out.println("the volume of the box2 is "+box2.volume());
	}

}
