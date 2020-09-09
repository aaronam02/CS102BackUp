// Aaron Amankwaah
// 09/09/2020
// PP 8.5
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;


public class PP_8_5{
// PP 8.5 Write a program that computes and prints the mean and standard deviation 
// of a list of integers x through x .Assume that there will be no more than 50 
// input values. Compute both the mean and standard deviation as floating point
// values, using the following formulas. mean= ∑ i=1 n Xi n  |   sd= ∑ i=1 n (xi −mean)2

    public static void main(String[] args) {
        System.out.println("Programing Project 8.5 by Aaron Amankwaah");
        // ArrayList<Integer> nums = new ArrayList<Integer>();
        int [] nums = {0, 40, 30, 50, 20, 20, 40, 60, 10 };
        System.out.println( );
        System.out.print( "[");
        for (int i : nums){
            System.out.print(i +",");
        }
        System.out.println( "]");

        // nums.add(20);
        // nums.add(10);
        // nums.add(0231);
        // nums.add(78);
        findMean(nums);
        System.out.println( );
        findSD(nums);

    }
    // static double findMean(ArrayList<Integer> nums){
    static double findMean(int[] nums){//finds mean of the array
        double mean = 0;
        // if (nums.size() == 0){
            if (nums.length == 0){
            System.out.println("No average becuase the list is empty");
         }else {
            double total = 0;
            for (int x : nums){
               total = total + x;
            }
            System.out.println("The total is  " + total);
            // mean = total / nums.size();
            mean = total / nums.length;
            System.out.println("The mean is: " + mean);
         }
        return mean;
    }

    // static double findSD(ArrayList<Integer> nums){// finds standard deviation of the array.
        static double findSD(int[] nums){
        double mean = findMean(nums);//calls find mean meathond to calculate mean for standard deviation
        double stanDev = 0.0;
        // int length = nums.size();
        int length = nums.length;
        for(double num: nums) {
            stanDev += Math.pow(num - mean, 2);
        }
        System.out.println("The standard deviation is: " + Math.sqrt(stanDev/length));
        return Math.sqrt(stanDev/length);
    }

}