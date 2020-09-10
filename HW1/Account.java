import java.util.ArrayList;
public class Account{
    private final double RATE = 0.03; // interest rate of 3.0%
    private long acctNumber;
    private double balance;
    private String name;
    public Account(String owner, long account, double initial){
        name = owner;
        acctNumber = account;
        balance = initial;
        
        }
        public double depositMoney(double amount){
        balance = balance + amount;
        return balance;
        }
        
        public double withdrawMoney(double amount, double fee){
        balance = balance - (amount + fee);
        return balance;
        }
        
        public void addInterest(){
        // adds interest to all account
        balance = balance + (balance * RATE);
        // return balance;
        }
        
        public double getBalance(){
        return balance;
        }
        public String getName(){
            return name;
        }

        public long getAccNum(){
            return acctNumber;
        }

        public String getAccountInfo(){
            String info = "This account belongs to " + getName(); 
            info += ". \nThis account number is: " + getAccNum();
            info +=". \nYour account has a balance of $"+ getBalance();
    
            return info;
            }
    }