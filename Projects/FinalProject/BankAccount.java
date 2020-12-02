package FinalProject;

// Write a class BankAccount, with two subclasses, Savings and Checking that inherit from it.
// Savings account holders earn an interest of 1.5% and maintain a minimum of $1000 to avoid
// monthly service charges of $15.00. Checking account holders are not required to maintain $500
// minimum to avoid the $15 service charge. Both accounts are linked and can use a ATM machine
// for withdrawal and withdrawals. A service charge of $4.00 is assessed for using non-member
// ATM machines. Start with an abstract BankAccount class and derive the two subclasses: Saving
// and Checking. Create several accountholder objects with different starting balances and
// different set of transactions and prepare monthly statements for each. Sample report includes:
// Account Name: ... Account Address:
// Account number: ... Account Type: ...
// Starting balance: ... Ending Balance: ....
// Number of transactions: ... Service Charge: ....
// Total Debit: .... Total Credit: ....
// Interest Earned: .... Service Charge: ....
import java.text.DecimalFormat;
public  class BankAccount{
	protected String accountName;
	protected String accountNumber;
	protected double balance;
	protected double deposit;
	protected double withdraw;
	protected double Annual_rate;
	protected double serviceCharge;
	protected int depNum;
	protected int witNum;
	DecimalFormat fmt = new DecimalFormat("0.00");
	
	public BankAccount(String accNam, String accNum,double bal,double rat){
		accountName=accNam;
		accountNumber=accNum;
		balance = bal;
		Annual_rate = rat;
	}
	public  void deposited(double dep){}		//Abstract method
	
	public  void withdrawn(double wit){}		//Abstract method
	
	public  void calcInterest(){
		double Monthly_rate =  Annual_rate/12;
		double Monthly_Interest = balance*Monthly_rate;
		balance += Monthly_Interest;
	}
	public void monthlyProcess(double ser){
		serviceCharge = ser;
		balance -= serviceCharge;
		calcInterest();
		withdraw = deposit = serviceCharge = 0;
	}
	public String toString(){
return  "Account name: "+accountName+"\n"+"Account number: "+accountNumber+"\n"+"Account balance: "+fmt.format(balance)+"\n"+"Service charge: "+serviceCharge;	
	}
}
