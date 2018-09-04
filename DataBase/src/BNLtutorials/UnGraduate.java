package BNLtutorials;
import java.util.Comparator;



public class UnGraduate extends DataBase implements Comparable<UnGraduate>
{
	CGPA cgpa ;
	DateofBirth day;
	DateofBirth month;
	DateofBirth year;
	private Object getYear;
	
	public UnGraduate(Student student	, DateofBirth Date , CGPA cgpa)
	{
		super(student,Date);
		this.cgpa=cgpa;
	}
	
	public double getCgpa()
	{
		return cgpa.getCGPA();
	}
	public int DateofBirth()
	{
		return day.getDate();
	}
	public int MonthofBirth()
	{
		return day.getmonth();
	}
	public int YearofBirth()
	{
		return day.getYear();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s \n%s \n%.2f",student.toString(),Date.toString(),getCgpa());
	}

	@Override
	public int compareTo(UnGraduate arg0) 
	{
		return Comparator.comparing(UnGraduate::YearofBirth).thenComparingInt(UnGraduate::MonthofBirth).thenComparingInt(UnGraduate::DateofBirth).compare(this,arg0);
	}


	

}
