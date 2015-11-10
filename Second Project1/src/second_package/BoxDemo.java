package second_package;

public class BoxDemo {
	
	public static void main(String[] args){
		
		Box mybox = new Box();
		double vol;
		//assign values to mybox's instance variable
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
		//compute volume of the box
		vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume is " +vol);	
		
	}
	
}


	