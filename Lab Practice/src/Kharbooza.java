public class Kharbooza extends Melon
{
	private final double antiPer=0.00001;
	
	public Kharbooza(double weight)
	{
		super.setWeight(weight);
	}
	@Override
	public double getAntiOcident()
	{
		return antiPer * super.getWeight();
	}

	
}
