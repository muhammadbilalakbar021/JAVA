package BNLtutorials;
public class DateofBirth 
{
	private int month;
	private int date;
	private int year;
	private static final int[] daysPerMonth ={0,31,28,31,30,31,31,30,31,30,31};
	
	public DateofBirth(int month ,  int date, int year)
	{
		if(month <0 || month >12 || date <0 || date >31 || year<0 || year >9999)
			throw new IllegalArgumentException("Error Please check your month, day and Year");
		if(month==2 && date==29 && !(year%400==0 || year %4==0 && year%100!=0 ))
		{
			throw new IllegalArgumentException("Out of range ! this date does not exist !");
		}
		
		this.month=month;
		this.date=date;
		this.year=year;
	}
	public void SetMonth(int month)
	{
		this.month=month;
	}
	public void SetDate(int date)
	{
		this.date=date;
	}
	public void SetYear(int year)
	{
		this.year=year;
	}
	
	public int getmonth()
	{
		return month;
	}
	
	public int getDate()
	{
		return date;
	}

	public int getYear()
	{
		return year;
	}

	public String toString()
	{
		return String.format("%d %d %d",month,date,year);
	}
}
