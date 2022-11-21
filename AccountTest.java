class CheckingAccount
{
	String name;
	 int balance;
	
	public void withDraw(int amount)
	{
		if(balance<amount)
		{
			System.out.println("low balance!!");
		}
		else if(amount<0)
		{
			System.out.println("wrong amount entered!!");
		}	
		else
		{
			balance=balance-amount;
			System.out.println("Available balance : " + balance);
		}
	}
	
}

class AccountTest
{
    public static void main(String [] args)
 {
	  int  bal=Integer.parseInt(args[0]);
	 int amu = Integer.parseInt(args[1]);
	CheckingAccount cust = new CheckingAccount();
	cust.name="James Gosling";
	cust.balance=bal;
	cust.withDraw(amu);
	
	System.out.println("Customer name : " + cust.name);
	
	
 }
}