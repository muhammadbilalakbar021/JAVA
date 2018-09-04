import java.util.InputMismatchException ;
import java.util.Scanner;

public class Exceptions
{

  public static void main ( String[] a )
  {
    Scanner scan = new Scanner( System.in  );
    int num,num2 ;

    System.out.print("Enter an integer: ");

    try
    { 
      num    = scan.nextInt();      
	  num2    = scan.nextInt();  
      System.out.println("The square of " + num + " is " + num/num2 );
    } 

    catch ( InputMismatchException ex )
    { 
      System.out.println("INput mis match exception" );
       
    } 
	catch (ArithmeticException arithmeticException)
	{
		System.out.println("Arithmetic Execption" );
      
	}
	catch (Exception e)
	{
	System.out.println("Full Exception" );
      
	  }
	  finally 
	  {
	  System.out.println("Final block" );
      
	  }
	

    System.out.println("Good-by" );

  }
}
