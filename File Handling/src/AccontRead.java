import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class AccontRead 
{
	private static ObjectInputStream input;
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
			input =new ObjectInputStream(Files.newInputStream((Paths.get("Clients.ser"))));
		}
		catch(IOException ioexception)
		{
			System.err.println("Error opening File !! Terminating");
			System.exit(1);
		}
	}
	public static void ReadFile()
	{
		System.out.printf("%-10s %-12s %-12s %-10s%n","Account","First Name","Last Name","Balance");
		
		try
		{
			while(true)
			{
				Account record=(Account) input.readObject();
				System.out.printf("%-10d %-12s %-12s %-10.2f%n",record.getAccount(),record.getFirstName(),record.getLastName(),record.getBalance());
			}
		}
		catch(EOFException eofException)
		{
			System.out.printf("No more Records");
		}
		catch(ClassNotFoundException classNotFoundException )
		{
			System.err.printf("Invalid Objest Type ! Terminating");
			
		}
		catch(IOException ioException)
		{
			System.err.println("Error writing to File ! Terminating");
			
		}
		
	}
	public static void closeFile()
	{
		try 
		
		{
			if(input!=null)
			input.close();
		}
		
	
		catch(IOException ioException)
	{
		System.err.println("Error writing to File ! Terminating");
	}
}
}
