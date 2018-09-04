public class Rectangle extends TwoDShape
{
	private  double length;//same as circle class
	private  double width;
	
	
	public Rectangle(double length,double width)
	{
		if(length<0.0)
			throw new IllegalArgumentException("length must be greater than 0.0");
		this.length=length;

		if(width<0.0)
			throw new IllegalArgumentException("width must be greater than 0.0");
		this.width=width;		
	}
	public void setLength(double length)
	{
		if(length<0.0)
			throw new IllegalArgumentException("length must be greater than 0.0");
		this.length=length;
	}
	public void setWidth(double width)
	{
		if(width<0.0)
			throw new IllegalArgumentException("width must be greater than 0.0");
		this.width=width;		
	}
	
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	
	@Override
	public double area()
	{
		return length*width;
		
	}
	@Override
	public double perimeter()
	{
		return 2*(length+width);
	}
	
	
	
}