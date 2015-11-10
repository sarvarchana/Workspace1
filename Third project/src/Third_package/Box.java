package Third_package;

public class Box {
	
	double width;
	double height;
	double depth;
	
	Box(double w, double h, double d)
	{
	  width = w;
	  height = h;
	  depth = d;
	}

	public double volume()
	{
		return width*height*depth;
	}
}

	
	
	