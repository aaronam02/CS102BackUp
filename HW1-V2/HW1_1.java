// Aaron Amankwaah
// 09/23/2020
// HW1-V2 #1

// Re-implement the CashRegister class (CashRegister_01) so that it keeps track of the price of
// each added item in an ArrayList&lt<Double>. Remove the itemCount and totalPrice instance
// variables. Re-implement the clear, addItem, getTotal, and getCount methods. Add a method
// displayAll that displays the price of all items in the current sale.

import java.util.ArrayList;

public class HW1_1{
public static void main(final String[] args) {
    System.out.println("This is Homeowrk 1 - Question #1. By Aaron Amankwaah, Output Below! \n");
    final CashRegister_01 register1 = new CashRegister_01();
    register1.addItem(1.95);
    register1.addItem(.95);
    register1.addItem(2.50);
    System.out.println("Actual count: " + register1.getCount());
    System.out.println("Expected count: 3\n");
    System.out.printf("Actual total: %.2f\n", register1.getTotal());
    System.out.printf("Expected total:5.40\n");
    register1.displayAll();
}

public static class CashRegister_01 {
    private final ArrayList<Double> items;

    // private int itemCount;
    // private double totalPrice;
    // constructor
    public CashRegister_01() {
        // itemCount = 0;
        // totalPrice = 0;
        items = new ArrayList<Double>();
    }

    // Add item to cash register
    public void addItem(final double price) {
        items.add(price);
    }

    // Get total price for current sale
    public double getTotal() {
        double totalPrice = 0.0;
        for (final double item : items) {
        totalPrice+= item;
    }
 return totalPrice;
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