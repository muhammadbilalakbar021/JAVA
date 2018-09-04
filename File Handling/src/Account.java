import java.io.Serializable;

public class Account implements Serializable
{
	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	
	public Account()
	{
		this(0, "", "", 0.0);
	}
	public Account(int account, String fname, String lname,double amount)
	{
		this.account=account;
		this.firstName=fname;
		this.lastName=lname;
		this.balance=amount;
	}
	
	public void setAccount(int acc)
	{
		this.account=acc;
	}
	public int getAccount()
	{
		return account;
	}
	
	public void setFirstName(String fname)
	{
		this.firstName=fname;
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String lname)
	{
		this.lastName=lname;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
}
