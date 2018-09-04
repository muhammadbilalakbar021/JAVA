package BNLtutorials;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
public class DataBaseTest 
{    
		private static int x,y,z;
		private static double a;
		private static String e,f;


	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		UnGraduate[] underGraduate =new UnGraduate[3];
		List<UnGraduate> list = new LinkedList<>();
		
		DateofBirth d1= new DateofBirth(11,26,1996);
		CGPA cgpa = new CGPA(2.6);
		Student s1= new Student("Bilal","Akbar",1);
		underGraduate[0] = new UnGraduate(s1,d1,cgpa);
	
		System.out.printf("1.  Add student records\n");
		System.out.printf("2.  Delete student records\n");
		System.out.printf("3.  Update student records\n");
		System.out.printf("4.  View all student records\n");
		System.out.printf("5.  Calculate an average CGPA of all  student scores\n");
		System.out.printf("6.  Show student who gets the max total score\n");
		System.out.printf("7.  Show student who gets the min total score\n");
		System.out.printf("8.  Find student by ID\n");
		System.out.printf("9.  Sort records by total Cgpa\n");
		System.out.printf("10. Sort records by First Name\n");
		System.out.printf("11. Sort records by Last Name\n");
		System.out.printf("12. Sort records by Date of Birth\n");
		list.add(underGraduate[0]);
		
		
		x=input.nextInt();		
		
		switch(x)
		{
		case 1 :
		{
			for(int i=1;i<3;i++)
			{
		
				System.out.println("Write Date of birth mm//DD//YEAR");
				x=input.nextInt();
				y=input.nextInt();
				z=input.nextInt();
				DateofBirth d2= new DateofBirth(x,y,z);
				System.out.println("Enter Cgpa");
				a=input.nextDouble();
				CGPA cgpa2 = new CGPA(a);
				System.out.println("Enter Student name ,Father name and roll number ");
				e=input.next();
				f=input.next();
				x=input.nextInt();
				Student s2= new Student(e,f,x);
				 underGraduate[i] = new UnGraduate(s2,d2,cgpa2);
			}
			for(UnGraduate un : underGraduate)
			{
				list.add(un);
			}
			break;
		}
		
		case 2 :
		{
			System.out.print("Which records do you want to Delete ?");
			System.out.print("For example 2 to 4");
			x=input.nextInt();
			y=input.nextInt();
			RemoveList(list,x,y);
			
			break;
		}
		case 3 :
		{
			System.out.println("Which Record you wnat to update ?");
			x = input.nextInt();
			System.out.println("1. First Name");
			System.out.println("2. Last Name");
			System.out.println("3. Roll number");
			System.out.println("4. Date of Birth");
			System.out.println("5. Day of birth");
			System.out.println("6. Year of birth");
			System.out.println("7. Cgpa");
			y= input.nextInt();
			
			switch(y) {
			case 1 :
			{
				System.out.println("Enter First Name");
				e=input.next();
				underGraduate[x].student.setFirstName(e);
				break;
			}
			case 2 :
			{
				System.out.println("Enter Last Name");
				e=input.next();
				underGraduate[x].student.setLastName(e);
				break;
			}
			case 3 :
			{
				System.out.println("Enter Roll Number");
				y=input.nextInt();
				underGraduate[x].student.setRollno(y);;
				break;
			}
			case 4 :
			{
				System.out.println("Enter  month");
				y=input.nextInt();
				underGraduate[x].Date.SetMonth(y);
				break;
			}
			case 5 :
			{
				System.out.println("Enter Date of month");
				y=input.nextInt();
				underGraduate[x].Date.SetDate(y);
				break;
			}
			case 6 :
			{
				System.out.println("Enter Year");
				y=input.nextInt();
				underGraduate[x].Date.SetYear(y);;
				break;
			}
			case 7 :
			{
				System.out.println("Enter CGPA");
				a =input.nextDouble();
				underGraduate[x].cgpa.SetCgpa(a);
				break;
				
			}
			
			}
		}
			
			
			
			
			case 4 :
			{
				System.out.print("List of all Students");
				for(UnGraduate db : list)
				{
					System.out.printf("%s ",db.toString());
				}
			}
			
			case 5 :
			{
				double avg =0,count;
				int counter=0;
				System.out.print("Average Cgpa of whole class is ");
				for(int i =0 ; i <list.size() ; i++)
				{
					avg += (double) underGraduate[i].getCgpa();
					counter =counter+1;
				}
				
				count=avg/(double)counter;
			}
			
			
			
			case 6 :
			{	
				double max=0;
				int count=0;
				System.out.printf("Finding max cgpa");
				for(int i =0 ; i<underGraduate.length;i++)
				{
					for(int j=0 ; j<underGraduate.length-1; j++)
					{
						if(underGraduate[j].cgpa.getCGPA() >  underGraduate[j+1].cgpa.getCGPA())
						{
							max=underGraduate[j].cgpa.getCGPA();
							
						}
						else
						{
							j++;
						}
					}
					i++;
				}
				System.out.printf("%.2f is the max CGPA",max);
				break;
			}
			
			case 7 :
			{
				double min=0;
				int count=0;
				System.out.printf("Finding min cgpa");
				for(int i =0 ; i<underGraduate.length;i++)
				{
					for(int j=0 ; j<underGraduate.length-1; j++)
					{
						if(underGraduate[j].cgpa.getCGPA() <  underGraduate[j+1].cgpa.getCGPA())
						{
							min=underGraduate[j].cgpa.getCGPA();
							
						}
						else
						{
							j++;
						}
					}
					i++;
				}
				System.out.printf("%.2f is the min CGPA",min);
				break;
			}
			
			case 8 :
			{
				System.out.printf("");
				break;
			}
			
			case 9 :
			{
				System.out.printf("Sorting Records by Cgpa ");
				Collections.sort(list ,new CGPAcomparator());
				System.out.printf("%s  ",list);
				break;
			}
			
			case 10 :
			{
				System.out.printf("Sortng Records by First Name");
				Collections.sort(list,new FirstNameComparator());
				System.out.printf("%s  ",list);
				break;
			}
			
			case 11 :
			{
				System.out.printf("Sortng Records by Last Name");
				Collections.sort(list,new LastNameComparator());
				System.out.printf("%s  ",list);
				break;
			}
			
		}

	}
	private static void RemoveList(List<UnGraduate> list, int start , int end)
	{
		list.subList(start, end).clear();
	}
}
