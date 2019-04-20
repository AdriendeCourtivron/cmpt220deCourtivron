 class Checking extends Account
{
	double overDraft = -5;
	

	public Checking() 
	{
		
	}

	public Checking (double balance,int id) 
	{
		super(id,balance);
	}

	public void withdraw(double amount) 
	{
		if (getBalance() - amount >= overDraft) 
		{
			super.withdraw(amount);
		}
		else
		 {
			 System.out.println("too much is being taken out");
		 }
			
	}
}
