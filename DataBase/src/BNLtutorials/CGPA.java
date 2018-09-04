package BNLtutorials;
public class CGPA 
{
	private Double CGPA;
	
	public CGPA(double cgpa)
	{
		this.CGPA=cgpa;
	}
	public void SetCgpa(double cgpa)
	{
		this.CGPA=cgpa;
	}
	
	public double getCGPA()
	{
		return CGPA;
	}
	
	public String toString()
	{
		return String.format("%.2f", CGPA);
	}
	
}
