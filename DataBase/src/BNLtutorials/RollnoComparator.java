package BNLtutorials;
import java.util.Comparator;
public class RollnoComparator implements Comparator<Student>
{
	@Override
	public int compare (Student s1 , Student s2)
	{
		return (int)(s1.getRollno()-(s2.getRollno()));
	}

}
