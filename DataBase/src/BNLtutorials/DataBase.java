package BNLtutorials;
import java.util.Comparator;
import java.util.InputMismatchException;
public abstract class DataBase 
{
	Student student;
	DateofBirth Date ;
	
	public DataBase(Student student	, DateofBirth Date )
	{
		try
		{
			this.student=student;
			this.Date=Date;
		}
		catch(InputMismatchException e)
		{
			System.out.print("Wrong input ");
		}
	}
	public String getFirstName()
	{
		return student.getFirstName();
	}
	public String getLastName()
	{
		return student.getLastName();
	}
	public int getRollno()
	{
		return student.getRollno();
	}
	
	
	@Override
	public String toString()
	{
		return String.format("%s %s ",student.toString(),Date.toString());
	}
	
	
}
