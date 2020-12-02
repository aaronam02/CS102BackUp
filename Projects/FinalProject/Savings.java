package HW2_Q5;

public  class Savings extends BankAccount{
	protected boolean status;
	public Savings(String accNam, String accNum, double bal, double rat){
		super(accNam, accNum, bal, rat);
	}
	public void Status(){
		if(balance >= 25)
		{
			status = true;
			// return "Account is currently active";
		}
		else
		{ 
			status = false;
			// return "Account is currently inactive";
		}
	}
	public void deposit(double dep){
			Status();
			if (status == false)
			System.out.println("Account is inactive, can't do this transaction.");
			else
			deposited(dep);						
	}
	public  void deposited(double dep){
		deposit=dep;
		balance+=deposit;
		depNum++;
	}

	public void withdraw(double wit){
		Status(); 
		if (status == true)
		{
			if(wit > balance)
			{
				System.out.println("Balance is not enough to do this withdraw.");
			}
			else
			{
				withdrawn(wit);
			}	
		}	
		else 
		{
			System.out.println("Account is inactive, no withdrawals allowed.");
		}		
	}
	public  void withdrawn(double wit){
		withdraw=wit;
		balance -=withdraw;
		witNum++;
	}
	public void monthlyProcess(double ser){
		System.out.println("Number of monthly withdrawals : " + witNum);
		System.out.println("Number of monthly deposits : " + depNum);
		if(witNum > 4)
		{
			serviceCharge += (witNum - 4);
			super.monthlyProcess(ser);
	Status();
		}
		else
		{
			super.monthlyProcess(ser);
			Status();
		}
	}
	public String toString(){
		return super.toString();
	}
}


