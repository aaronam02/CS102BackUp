// Aaron Amankwaah
// 09/23/2020
// HW1-V2 #4

// Implement a class Student. A student has a name and a total quiz score. Supply an appropriate
// constructor, and methods getName(), addQuiz(int score), getTotalScore(), and
// getAverageScore(). To compute the latter, also need to store the number of quizzes that the
// student took.

import java.util.ArrayList;
import java.util.*;

public class Student{
public static void main(String[] args){
    System.out.println("This is Homeowrk 1 - Question #4. By Aaron Amankwaah, Output Below! \n");
    // ArrayList<Student> students = new ArrayList<Student> ();
    Student jerry = new Student("Jerry", 0.0);
    add(jerry);
    jerry.addQuiz(86);
    jerry.getTotalScore();
    jerry.getAverageScore();

    // students.get(0).addQuiz(86);
    // students.get(0).getTotalScore();
    // students.get(0).getAverageScore();


    System.out.printf("Quizzes total score : %1.0f\n", jerry.getTotalScore());
    System.out.println("\n Avverage Quiz Score: " + jerry.getAverageScore());

}

public static class Student{
private ArrayList<Double> quizzes = new ArrayList<Double> ();
private String name; double quizTotal;
private ArrayList<Student> students = new ArrayList<Student> ();
//constructor
public  Student(String name, double quizTotal){
name = name;
quizTotal = quizTotal;
}
public  addStudent(Student identifier) {
    students.add(identifier);
    }
//Add item to cash register
public  void addQuiz(int score){
 quizzes.add(score);
 quizTotal += score;
}
//Get total price for current sale
public  int getTotalScore(){
    return quizTotal;
}
public  double getAverageScore(){
 return quizTotal/quizzes.size();
}
public  String getName(){
    return name;
}

}
}