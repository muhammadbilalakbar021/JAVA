package BNLtutorials;
import java.util.Comparator;
public class CGPAcomparator implements Comparator<UnGraduate>
{
	@Override
	public int compare (UnGraduate c1 , UnGraduate c2)
	{
		return (int)(c1.getCgpa()-c2.getCgpa());
	}

}
