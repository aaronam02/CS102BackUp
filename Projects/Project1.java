//Aaron Amankwaah
//Project 1
//10/29/2020

import java.util.*;
import java.util.Collections; 
public class Project1{
    public static void main(String[] args) {
        System.out.println("Output of Project 1 BELOW :) \n");//test rand num
        int[][] nums = new int[10][5];//array for "students"
        ArrayList<Integer> allNums  = new ArrayList<Integer>();//Arraylist for all nums genreated
        for (int r = 0; r< nums.length; r++){
            System.out.print("Student " + (r+1) + ":"); //start of output
            for (int c = 0; c< nums[r].length; c++){
                nums[r][c] = generateNewRandNum(allNums);
                System.out.print("\t" + nums[r][c] );//prints out each numbers
            }
            System.out.println();//new line of outputs
        }
        System.out.println(allNums);//have an idea of how many random nums it took
    }
    static int generateNewRandNum(ArrayList<Integer> allNums){
        int generatedNum = 0;//variable for random numbers
        boolean numPresent = false;
        while (!numPresent|| numPresent) {//reagrdless of what happens, keeps looping
            generatedNum = (int) (Math.random()*50)+1;//gerenates random number [1,50]
            numPresent = allNums.contains(generatedNum);
            allNums.add(generatedNum);
            Collections.sort(allNums);//sorts so that easy to check for "contians"
            if(!numPresent){
                return generatedNum;// breaks loop when new number genreated is not in the array
            }
        }
        return 0;//wont ever return 0, just here for compile errors
    }
}
