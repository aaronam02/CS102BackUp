//Aaron Amankwaah
//Project 2
//11/04/2020

import java.util.*;
public class Project2{
    public static void main(String[] args) {
        int numStudents;
        System.out.println("Output of Project 2 BELOW :) \n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        numStudents = scan.nextInt();
        double students[][] = new double[numStudents][6];//[1-4] grades, 5 is regular average, 6 is weghted avg
        for(int s=0; s<numStudents; s++){
            System.out.println("\nEnter the Grades for Student " + (s+1) +": ");
            for(int g=0; g<4; g++){
                System.out.print("Grade " + (g+1) +": ");   
                students[s][g] = scan.nextInt();
            }
            students[s][4]= regularAverage(students[s]); //calc regular avearage
            students[s][5]= weightedAverage(students[s]);//calc weighted averaged
        }
        scan.close();
        System.out.println("Student#\tGrade1\tGrade2\tGrade3\tGrade4\tAverage\tWeighted");//output lay out
        for(int s=0; s<numStudents; s++){
            System.out.print("\t" + (s+1) + "\t");
            for(int g=0; g<6; g++){
                System.out.print(students[s][g] + "\t");   
            }
            System.out.println();
        }
    }
    static double regularAverage(double[] students){//calculates regualr average of all grades
        double average = 0.0;
        for(int i = 0; i<students.length; i++){//sums up all the numbers in the list
            average+= students[i];
        }
        average = average/4;//finds average
        return average;
    }
    static double weightedAverage(double[] students){
        //calculates weigthed average of all grades with different wieghts of each grade
        double wAverage = 0.0;
        for(int i = 0; i<students.length; i++){
            if((i+1) == 1 || (i+1) == 4)//calculates waeted avarage 
                wAverage+= .2*(students[i]);
            else
                wAverage+= .3*(students[i]);
        }
        return wAverage;
    }
}
