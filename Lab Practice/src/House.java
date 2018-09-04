public class House implements Carbon 
{
	private final int CO2=40;
	private int carbondioxide;
	
	public House(int carbonDioxide)
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
