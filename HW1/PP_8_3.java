// Aaron Amankwaah
// 09/09/2020
// PP 8.3

import java.util.Scanner;//user input
import java.util.ArrayList; // use array list
import java.util.*;// collection sort to work

public class PP_8_3{
    
// Write a program that creates a histogram that allows you to visually inspect 
// the frequency distribution of a set of values. The program should read in an arbitrary 
// number of integers from a text input file that are in the range 1 to 100 inclusive; 
// then produce a chart similar to the one below that indicates how many input values fell 
// in the range 1 to 10, 11 to 20, and so on. Print one asterisk for each value entered.
    public static void main(String[] args) {
        System.out.println("Programing Project 8.3 by Aaron Amankwaah");
        Scanner scan = new Scanner(System.in);
        // takes in input
        int input = 1 ;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (input>= 1 && input <= 100){
            System.out.print("Please enter a value from 0 to 100 inllusive or greater than 100 to stop: ");
            input = scan.nextInt();
            nums.add(input);
            //adds input to the array
            System.out.println("You entered: "+ input );
        }
        Collections.sort(nums);
        //helps make it easeir to loop through
        System.out.println( nums );
        int count;
        for(int i = 11; i< 110; i+=10){
            count = 0;
            for (int num : nums){//counts numbers in intervals
                if ( num> i-11 && num<i ){
                    count++;
                }
            }
            String stars = "";
            int counter = 0;
            while (counter <= count)
            {//coudn't just do count*("x") like I could've in python
                stars+="*";
                counter = counter + 1;
            }
            if(i-10< 10){//fixes allignment
                System.out.println(i-10 + " - " + (i-1) + ("    | "+ stars));
            }else if(i-10< 90){
            System.out.println(i-10 + " - " + (i-1) + ("   | "+ stars));
            }else System.out.println(i-10 + " - " + (i-1) + ("  | "+ stars));
            
        }

    }
}