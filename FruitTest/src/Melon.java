public abstract class Melon extends Fruit
{
	private int vitC;
	
	public Melon(int weight , int vitC)
	{
		super(weight);
		this.vitC=vitC;
	}

	
	
	public double weight()
	{
		return(double)((vitC/100)*super.getWeight());
	}
	
}
