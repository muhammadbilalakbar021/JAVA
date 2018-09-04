package BNLtutorials;
import java.util.Comparator;
public class FirstNameComparator implements Comparator<UnGraduate>
{
	@Override
	public int compare(UnGraduate s1 , UnGraduate s2)
	{
		return (int)(s1.getFirstName().compareTo(s2.getFirstName()));
	}

}
