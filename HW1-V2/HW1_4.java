// Aaron Amankwaah
// 09/23/2020
// HW1-V2 #4

// Implement a class Student. A student has a name and a total quiz score. Supply an appropriate
// constructor, and methods getName(), addQuiz(int score), getTotalScore(), and
// getAverageScore(). To compute the latter, also need to store the number of quizzes that the
// student took.

// Modify the student class to computer grade point averages. Methods are needed to add a grade
// and get the current GPA. Specify the grades as elements of a class Grade. Supply a constructor
// that constructs a grade from a string, such as “B+”. You will also need a method that translates
// grades into their numeric values (for example, “B+” becomes 3.3).

import java.util.ArrayList;

public class HW1_4{
public static void main(String[] args){
    System.out.println("This is Homeowrk 1 - Question #4. By Aaron Amankwaah, Output Below! ");
    ArrayList<Student> students = new ArrayList<Student> ();
    // Student OBJECT_NAME = new Student(String studentName, String studentGPA or Grade.);
    Student jerry = new Student("Jerry", 4.0);
    
    students.add(jerry);
    jerry.addQuiz(86);
    jerry.getTotalScore();
    jerry.getAverageScore();
    jerry.addQuiz(97.02);

    Student tom = new Student("Thomas", 4.0);
    students.add(tom);
    tom.addQuiz(73);
    tom.getTotalScore();
    tom.getAverageScore();
    tom.addQuiz(94.06);

    for (Student x: students){
        System.out.printf("\n\n" + x.getName() + " has a total quiz score of: %1.0f\n", x.getTotalScore());
        System.out.printf("An average Quiz Score of: %.2f\n", x.getAverageScore());
        x.toString();
    }
}

public static class Student{
private ArrayList<Double> quizzes = new ArrayList<Double> ();
private String name; double quizTotal; String grade; double gpa; double avgQuizzes;
//constructor
public  Student(String studentname, double student_gpa ){
name = studentname;
quizTotal = 0.0;
avgQuizzes = (quizTotal/quizzes.size());
grade = "A+";
gpa = student_gpa;
}
//Add item to cash register
public void addQuiz(double score){
 quizzes.add(score);
 quizTotal += score;
}
//Get total price for current sale
public double getTotalScore(){
    // System.out.print("\nQUIZZ TOTAL " + quizTotal);
    return quizTotal;
}
public double getAverageScore(){
    avgQuizzes = quizTotal/quizzes.size();
    avgQuizzes = Math.round(avgQuizzes*100.0)/100.0;
    // System.out.print("\nQUIZZ AVG " + avgQuizzes);
 return (avgQuizzes) ;
}
public String getName(){
    return name;
}
//calculates grade using RU scale
public String getGrade(){
    if (avgQuizzes <= 59.49)
        grade = "F-";
    else if (avgQuizzes <= 69.49)
        grade = "D";
    else if (avgQuizzes <= 74.49)
        grade = "C";
    else if (avgQuizzes <= 79.49)
        grade = "C+";
    else if (avgQuizzes <= 84.49)
        grade = "B";
    else if (avgQuizzes <= 89.49)
        grade = "B";
    else  if (avgQuizzes <= 100.59)
        grade = "A";
    return grade;
}
//calculates grade using RU scale
public double getGPA(){
    if (grade == "F-")
        gpa =0.0 ;
    else if (grade == "D")
        gpa =1.0 ;
    else if (grade == "C")
        gpa =2.0 ;
    else if (grade == "C+")
        gpa =2.5 ;
    else if (grade == "B")
        gpa =3.0 ;
    else if (grade == "B")
        gpa =3.5 ;
    else  if (grade == "A")
        gpa =4.0 ;
    return gpa;
}

public String toString(){
    System.out.printf( getName() + " has taken " + quizzes.size() + 
    " quizzes and has an avereage quiz score of: " + getAverageScore() 
    + " has a grade of " +getGrade() + " and a GPA of "+ getGPA());
    return ".";
}

}
}