package Third_package;

public class Boxdemo {

	public static void main(String[] args) {
	
		
		Box mybox1 = new Box(); //creates mybox1 object - This object is the instance of the Box class
		Box mybox2 = new Box(); // creates mybox2 object - This object is the another  instance of Box class
		
		double vol;
		
		//assign values to mybox1's instance variables
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		//assign values to mybox2's instance variables
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		//compute volume for first box
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("Volume of mybox1 "+vol);
				
		//compute volume for second box
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("Volume of mybox2 "+vol);
	}

}
