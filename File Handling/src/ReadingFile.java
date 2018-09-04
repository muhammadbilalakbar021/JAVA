import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;

public class ReadingFile 
{
	private static Scanner input;
	public static void main(String[] args)
	{
		openFile();
		ReadFile();
		closeFile();
	}
	
	public static void openFile()
	{
		try
		{
			input =new Scanner(Paths.get("E:\\Java\\File Handling\\clients.txt"));
		}
		catch(IOException ioexception)
		{
			System.err.println("Error opening File !! Terminating");
			System.exit(1);
		}
	}
	public static void ReadFile()
	{
		try
		{
			System.out.printf("%-10d %-12s %-12s %12.2f %n",input.nextInt(),input.next(),input.next(),input.nextDouble());
		}
		catch(NoSuchElementException elementException)
		{
			System.err.println("Invalid Input !! Please Try again");
			input.nextLine();
		}
		catch(IllegalStateException stateException)
		{
			System.err.println("Error reading from File !! Terminatting");
		}
		
	}
	public static void closeFile()
	{

		if(input!=null)
		input.close();
	}
}
