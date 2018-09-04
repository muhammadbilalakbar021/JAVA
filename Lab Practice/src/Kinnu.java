public  class Kinnu extends Citrus
{
	private final double vitPer=0.03;
	
	
	public  Kinnu(double weight)
	{
		super.setWeight(weight);
	}
	
	
		
	@Override
	public double getVitamin()
	{
		return vitPer * super.getWeight();
	}

}
