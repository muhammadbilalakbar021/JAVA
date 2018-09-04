import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.*;
import java.util.*;
public class AccountWrite 
{
	private static ObjectOutputStream output;
	
	public static void main (String [] args)
	{
		openFile();
		addRecords();
		closeFile();
	}
	
	public static void openFile()
	{
		try 
		{
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get("Clients.ser")));
		}
		catch(IOException ioException)
		{
			System.err.println("Error opening File ! Terminating");
			System.exit(1);
		}
	}
	
	public static void addRecords() /*throws IOException*/
	{
		Scanner input =new Scanner(System.in);
		System.out.printf("%s%n%s%n?","Enter account number, First Name , Last name and Balance","Press CTRL-Z to end file");
		while(input.hasNext())
		{
			try
			{
				Account record =new Account(input.nextInt(),input.next(),input.next(),input.nextDouble());
				
				output.writeObject(record);
			}
			catch(NoSuchElementException noSuchElementException )
			{
				System.err.println("Invalid input . Please TRY again");
				input.nextLine();
			}
			catch(IOException ioException)
			{
				System.err.println("Error writing to File ! Terminating");
				break;
			}
			System.out.print("?");
		}
	}
	
	public static void closeFile()
	{
		try
		{
			if(output != null)
			{
				output.close();
			}
		}
		catch(IOException ioException)
		{
			System.err.println("Error writing to File ! Terminating");
		}
	}
}
