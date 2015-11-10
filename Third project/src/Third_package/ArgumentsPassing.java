package Third_package;

public class ArgumentsPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.DimensionsSet(10, 10, 10);
		box2.DimensionsSet(20, 20, 20);
		
		System.out.println("The volume of the box1 is "+box1.volume());
		System.out.println("The volume of the box2 is "+box2.volume());
		
	}

}
