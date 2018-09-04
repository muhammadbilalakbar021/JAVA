package BNLtutorials;
public class Student 
{
	private String FirstName;
	private String LastName;
	private int rollNo;
	
	public Student(String firstname , String Lastname ,int rollno)
	{
		if(rollno<0 || rollno >100)
		{
			throw new IllegalArgumentException("Out of range ! this date does not exist !");
		}
		
		this.FirstName=firstname;
		this.LastName=Lastname;
		this.rollNo=rollno;
	}
	public void setFirstName(String firstname)
	{
		this.FirstName=firstname;
	}
	public void setLastName(String Lastname)
	{
		this.LastName=LastName;
	}
	public void setRollno(int roll)
	{
		this.rollNo=roll;
	}
	
	public String getFirstName()
	{
		return FirstName;
	}
	
	public String getLastName()
	{
		return LastName;
	}
	
	public int getRollno()
	{
		return rollNo;
	}
	
	public String toString()
	{
		return String.format("%s %s %d", FirstName,LastName,rollNo);
	}
}
