import java.io.IOException;
import java.nio.file.Path;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.nio.file.Files;
import java.nio.file.DirectoryStream;
import java.nio.file.Paths;
import java.util.Scanner;
public class CheckingDirectory 
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		Path path=Paths.get(input.nextLine());
		
		System.out.println("Enter the Directory Path");
		
		if(Files.exists(path))
		{
			System.out.printf("%n%sExists%n",path.getFileName());
			System.out.printf("%s A Directory  %n",Files.isDirectory(path)?"Is" : "Is not");
			System.out.printf("%sAn Absolute Path%n",path.isAbsolute() ?"Is":"Is not");
		try
		{
				System.out.printf("Last modified%s%n",Files.getLastModifiedTime(path)); 
		}
		catch(SecurityException securityException )
		{
			System.err.println("Write permission denied. Terminatting");
			System.exit(1);
		}
		catch(IOException securityException )
		{
			System.err.println("Write permission denied. Terminatting");
			System.exit(1);
		}
		
		try
		{
			System.out.printf("Size %s%n",Files.size(path));
		}
		catch(SecurityException securityException )
		{
			System.err.println("Write permission denied. Terminatting");
			System.exit(1);
		}
		catch(IOException securityException )
		{
			System.err.println("Error Opening File. Terminatting");
			System.exit(1);
		}
		
			
			System.out.printf("Path %s%n",path);
			System.out.printf("Absolute Path %s%n",path.toAbsolutePath());
		}
		if(Files.isDirectory(path))
		{
			System.out.printf("%n Directory Contents%n");
		try
		{
			DirectoryStream<Path> directoryStream=Files.newDirectoryStream(path);
			for(Path p :directoryStream)
			{
				System.out.println(p);
			}
		}
		catch(SecurityException securityException )
		{
			System.err.println("Write permission denied. Terminatting");
			System.exit(1);
		}
		catch(IOException securityException )
		{
			System.err.println("Error Opening File. Terminatting");
			System.exit(1);
		}
		
			
			
			
		}
		
	else
	{
		System.out.println("Error");
	}
	}
	

}
