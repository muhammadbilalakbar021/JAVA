public abstract  class Citrus extends Fruit
{
	private int vitC;
	
	public Citrus(int weight , int  vitC2)
	{
		super(weight);
		this.vitC=vitC2;
	}
	
	public double weight()
	{
		return(double)((vitC/100)*super.getWeight());
	}
	
}
