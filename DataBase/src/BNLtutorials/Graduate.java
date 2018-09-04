package BNLtutorials;
public class Graduate extends DataBase
{
	private String project;
	
	
	public Graduate(Student student	, DateofBirth Date , String project)
	{
		super(student,Date);
		this.project=project;
	}
	
	public String getProject()
	{
		return project;
	}

	
	@Override
	public String toString()
	{
		return String.format("%s %s ",student.toString(),Date.toString(),getProject());
	}

	
	
}
