// Aaron Amankwaah
// 09/09/2020
// PP 8.6

import java.util.ArrayList;
import java.util.Scanner;
import Account.java;//althugh has error when you click proceed it still works

public class PP_8_6{
// PP 8.6 The L&L Bank can handle up to 30 customers who havesavings accounts. 
// Design and implement a program that manages the accounts. Keep track of key 
// information and allow each customer to make deposits and withdrawals. Produce
// appropriate error messages for invalid transactions. Hint: You may want 
// to base your accounts on the Account class from Chapter 4 . Also provide 
// a method to add 3 percent interest to all accounts whenever the method is invoked.

    public static void main(String[] args) {
        System.out.println("Programing Project 8.6 by Aaron Amankwaah");
        ArrayList<Account> accounts = new ArrayList<Account>();// stores all accounts
        Account tommy = new Account("Thomas", ( (int) (Math.random()*100000000)), 10000.09);
        //random number assigns a random account #
        System.out.println(tommy.getAccountInfo());
        System.out.println();
        accounts.add(tommy);// adds tommy's account to database
        payInterest(accounts); // adds interest to all account
        System.out.println(tommy.getAccountInfo());
        }

    static void payInterest(ArrayList<Account> accounts){
        // adds interest to all account
        for (Account i : accounts){
            i.addInterest();
        }

    }


}
