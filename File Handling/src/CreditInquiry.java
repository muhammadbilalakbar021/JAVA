import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class CreditInquiry 
{
	private final static MenuOption[] choices =MenuOption.values();
	
	public static void main(String[] args)
	{
		MenuOption accountType=getRequest();
		
		while(accountType!= MenuOption.END)
		{
			switch (accountType)
			{
			case ZERO_BALANCE:
				System.out.printf("%nAccounts with zero Balance :%n");
				break;
			
			case CREDIT_BALANCE:
				System.out.printf("%nAccounts with CREDIT Balance :%n");
				break;
				
			case DEBIT_BALANCE:
				System.out.printf("%nAccounts with Debit Balance :%n");
				break;
			}
			readRecords(accountType);
			accountType=getRequest();
		}
	}

private static MenuOption getRequest()
{
			int request =4;
			System.out.printf("%n enter Request %s%n%s%n%s%n%s%n%n","1- Account list with zero Balances","2- List account with credit Balances","List account with Debit Balances","4- Exit");
			try
		{
				Scanner input =new Scanner(System.in);

				do
				{
					System.out.printf("%n?");
					request=input.nextInt();
				}
				while((request<1)||(request>4));
		}
			catch(NoSuchElementException noSuchElementException)
			{
				System.err.println("Invalid input. Terminating");
			}
			
			return choices[request-1];

}
private static void readRecords(MenuOption accountType)
{
			try(Scanner input=new Scanner(Paths.get("Clients.txt")))
			{
				while(input.hasNext())
				{
					int accountNumber=input.nextInt();
					String firstName=input.next();
					String lastName=input.next();
					double balance=input.nextDouble();
					
					if(shouldDisplay(accountType,balance))
						System.out.printf("%-10d%-12s%-12s%10.2f%n",accountNumber,firstName,lastName,balance);
					else
						input.nextLine();
				}
			}
			catch(NoSuchElementException |IllegalStateException | IOException e)
			{
				System.err.println("Error Processing File. Terminating");
				System.exit(1);
			}
}
private static boolean shouldDisplay(MenuOption accountType, double balance)
{
	if((accountType == MenuOption.CREDIT_BALANCE)&&(balance<0))
		return true;
	else if((accountType == MenuOption.DEBIT_BALANCE) &&(balance>0))
		return true;
	else if((accountType == MenuOption.ZERO_BALANCE) &&(balance>0))
		return true;
	return false;
}

}