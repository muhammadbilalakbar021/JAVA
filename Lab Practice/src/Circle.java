public class Circle extends TwoDShape
{
	private  double radius;//removing final because you have to set the value 
	
	
	public Circle( double radius)
	{
		if(radius<0.0)
			throw new IllegalArgumentException("radius must be greater than 0.0");
		this.radius=radius;
	}
	
	public void setRadius(double radius)//setter of circle class to set the value from test class
	{
		if(radius<0.0)
			throw new IllegalArgumentException("radius must be greater than 0.0");
		this.radius=radius;
	}	
	
	public double getRadius()
	{
		return radius;
	}
	@Override
	public double area()
	{
		return 3.14*radius*radius;
	}
	@Override
	public double perimeter()	
	{
		return 2*3.14*radius;
	}
	
	
	
	
	
}