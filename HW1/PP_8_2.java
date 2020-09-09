import java.util.ArrayList;
import java.util.*;

public class PP_8_2{

// Modify the program from PP 8.1 so that it works for
// numbers in the range between -25 and 25.
    public static void main(String[] args){
       System.out.println("this is question 2");
       ArrayList<Integer> nums = new ArrayList<Integer>();
       boolean allEntries = false;
       while ( allEntries == false ) {
       // System.out.println(num);
        //generates a random number betwee -25 to 25. 
       int num = -25 + (int) (Math.random() * ((25 - (-25)) + 1));
       // System.out.println(num);
           nums.add(num);
       Collections.sort(nums); // helps make it easier to loop through
       System.out.println(nums); // help visulaze whats in the array
       int [] array = new int[nums.size()];
       for (int i =0; i<nums.size(); i++){
           array[i]= nums.get(i);
       }// couldn't find a way to pass nums arraylist & loop through it so made it into an array
       allEntries = allEntries(array);//checks if 0-50 populated or not.
       }
       int [] array = new int[nums.size()];
       for (int i =0; i<nums.size(); i++){
           array[i]= nums.get(i);
       }
       for( int i = -25; i <array.length; i++){//-25 is minumum
           if( countNum(array, i) > 0 ){//just prints how many times 0-50 are in array.
               System.out.println( i + " appears " + countNum(array, i) + " times in the arbituary.");
           }
       }
   }
   
   static boolean allEntries(int[] array){
       boolean allEntries = false;
   // checks array to see if 0-50 are in it
       for (int a = 1; a< array.length; a++){
           if ( (array[a] - array[a-1]) > 1  ){
               allEntries = false;
               System.out.println(array[a-1]+1 + " does not exist in the array nums");
               //helps visulaze why its taking so long and understand outputs better
               return allEntries;
           }else {
               allEntries = true;
           }
       }//checks to see if all numbers are in array
       return allEntries;
   }
   
   // checks array for how many times a number is in it
   static int countNum(int[] array, int num){
       int count = 0;
       for(int i : array){
           if (i == num )
           count ++;
       // counts how many times a number appears in an array.
       } 
       return count;
   }
}