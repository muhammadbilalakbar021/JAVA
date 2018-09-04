public class Bicycle implements Carbon
{
	private final int CO2=1;
	private int carbondioxide;
	
	public Bicycle(int carbonDioxide)
	{
		this.carbondioxide=carbonDioxide;
	}
	@Override
	public int getCarbon()
	{
		return CO2 *carbondioxide;
	}	
	@Override
	public int getCarboNDioXide()
	{
		return carbondioxide;
	}
	
	

	
}
