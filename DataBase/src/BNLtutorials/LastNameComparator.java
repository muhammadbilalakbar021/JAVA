package BNLtutorials;
import java.util.Comparator;
public class LastNameComparator implements Comparator<UnGraduate>
{
	@Override
	public int compare (UnGraduate s1 , UnGraduate s2)
	{
		return (int)(s1.getLastName().compareTo(s2.getLastName()));
	}

}
