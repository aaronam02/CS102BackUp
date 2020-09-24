// Aaron Amankwaah
// 09/23/2020
// HW1-V2 #2

// Re-implement the CashRegister class (CashRegister_02) so that it keeps track of the total price
// as an integer: the total cents of the price. For example, instead of 17.29, store the integer 1729.
// Such an implementation is commonly used because it avoids the accumulation of round off
// errors. Do not change the public interface of the class.


import java.util.ArrayList;
import java.util.*;

public class CashRegisterTester_02{
public static void main(String[] args){
    System.out.println("This is Homeowrk 1 - Question #2. By Aaron Amankwaah, Output Below!");
    CashRegister_02 register1 = new CashRegister_02();
    register1.addItem(1.95);
    register1.addItem(.95);
    register1.addItem(2.50);
    System.out.println("Actual count: " + register1.getCount());
    System.out.println("Expected count: 3\n");
    System.out.printf("Actual total: %1.0f\n", register1.getTotal());
    System.out.printf("Expected total:5.40\n");
}

public static class CashRegister_02{
private  ArrayList<Double> items;
//constructor
public CashRegister_02(){
items = new ArrayList<Double>();
}
//Add item to cash register
public void addItem(double price){
 items.add(price);
}
//Get total price for current sale
public double getTotal(){
    double totalPrice= 0.0;
    for (double item: items){
        totalPrice+= item;
    }
// int total = ((int) (totalPrice*100));
//  return total;
 return  (totalPrice*100);

}
public int getCount(){
 return items.size();
}
public void clear(){
    items.clear();
}
public void displayAll(){
    System.out.println(items);
}

}
}