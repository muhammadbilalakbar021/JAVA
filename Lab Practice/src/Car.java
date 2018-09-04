public class Car implements Carbon
{
	private final int CO2=10;
	private int carbondioxide;
	
	public Car(int carbonDioxide)
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
