package Third_package;

public class ReturnCallingMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Box box1 = new Box();
		Box box2 = new Box();	
		
		double vol;
		
		
		box1.width = 10;
		box1.height = 10;
		box1.depth = 10;
		
		box2.width = 20;
		box2.height = 20;
		box2.depth = 20;
	
		vol = box1.volume();
		System.out.println("the volume of box1 is "+vol);
		
		vol = box2.volume();
		System.out.println("the volume of box2 is "+vol);
		
	}

}
