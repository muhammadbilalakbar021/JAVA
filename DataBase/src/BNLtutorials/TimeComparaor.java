package BNLtutorials;
import java.util.Comparator;

public class TimeComparaor implements Comparator<DateofBirth> 
{
	public int compare(DateofBirth d1 , DateofBirth d2)
	{
		return (d1.getYear()-d2.getYear());
	}
}
