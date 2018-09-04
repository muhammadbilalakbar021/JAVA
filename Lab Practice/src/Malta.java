public  class Malta extends Citrus
{
	private final double vitPerc=0.02;
	
	
	public  Malta(double weight)
	{
		super.setWeight(weight);
	}
	
	
		
	@Override
	public double getVitamin()
	{
		return vitPerc * super.getWeight();
	}

}
