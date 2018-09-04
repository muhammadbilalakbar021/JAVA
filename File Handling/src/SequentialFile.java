import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SequentialFile 
{
	private static Formatter output;
	
	public static void main (String[] args)
	{
		openFile();
		addRecords();
		closeFile();
	}
	public static void openFile()
	{
		try
		{
			output = new Formatter("clients.txt");
		}
		catch(SecurityException securityException )
		{
			System.err.println("Write permission denied. Terminatting");
			System.exit(1);
		}
		catch(FileNotFoundException fileNotFoundExceptoion)
		{
			System.err.println("Error Opening File. Terminatting");
			System.exit(1);
		}
	}
	public  static void addRecords()
	{
		Scanner input =new Scanner(System.in);
		System.out.printf("%s%n%s%n *_ ","Enter account number  First Name Last Name, Balance","and ctrl-z to END");
		
		while(input.hasNext())
		{
			try
			{
				output.format("%d %s %s %.2f %n",input.nextInt(),input.next(),input.next(),input.nextDouble());
			}
			catch(FormatterClosedException formatterClosedException)
			{
				System.err.println("Error Writng to File");
			}
			catch(NoSuchElementException elementException)
			{
				System.err.println("Invalid Input !! Please Try again");
				input.nextLine();
			}
			
			System.out.print("?");
		}
		
	}
	public static void closeFile()
	{
		if(output!=null)
		output.close();
	}
	
}

