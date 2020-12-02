
package FinalProject;


public class BankAccountTester extends Deposit {
  
	public static void main(String[] args) {
		Savings account1 = new Savings("Jane", "86443620845",10000, 0.15);
		account1.withdraw(50);
		account1.withdraw(200);
		account1.deposit(500);
		account1.calcInterest();
		System.out.println(account1);
		System.out.println();
		Savings account2 = new Savings("Tom", "8644140847",5, 0.15);
		account2.withdraw(100);
         System.out.println(account2);	
         System.out.println();
        Checking account3 = new Checking("Jerry", "8644140857",5000, 0);		
        Checking account4 = new Checking("Jemmy", "8644140827",9000006, 0);
        account3.withdraw(50);
		account4.withdraw(100);
		account3.deposit(500);
        account3.calcInterest();	
        System.out.println(account3);
        System.out.println();
        System.out.println(account4);	
	}

}
