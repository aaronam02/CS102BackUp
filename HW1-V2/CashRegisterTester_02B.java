// Aaron Amankwaah
// 09/23/2020
// HW1-V2 #3

// After closing time, the store manager would like to know how much business was transacted
// during the day. Modify the CashRegister class (CashRegister_02) to enable this functionality.
// Supply methods getSalesTotal and getSalesCount to get the total amount of all sales and the
// number of sales. Supply a method resetSales that resets any counters and totals so that the next
// day’s sales start from zero.

import java.util.ArrayList;
import java.util.*;

public class CashRegisterTester_02B{
public static void main(String[] args){
    System.out.println("This is Homeowrk 1 - Question #2. By Aaron Amankwaah, Output Below!");
    CashRegister_02B register1 = new CashRegister_02B();
    register1.addItem(1.95);
    register1.addItem(.95);
    register1.addItem(2.50);
    System.out.println("Actual count: " + register1.getCount());
    System.out.println("Expected count: 3\n");
    System.out.printf("Actual total: %1.0f\n", register1.getTotal());
    System.out.printf("Expected total:5.40\n");
}

public static class CashRegister_02B{
private  ArrayList<Double> items;
//constructor
public CashRegister_02B(){
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