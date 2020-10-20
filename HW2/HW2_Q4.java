//Aaron Amankwaah
//HW2_Q4 10-20-2020

// Design and implement a program that creates an exception class called
// InvalidDocumentCodeException, designed to be thrown when an improper designation for
// document is encountered during processing. Suppose in a particular business all documents are
// given two-character designation starting with either U, C, or P, standing for unclassified,
// confidential, or proprietary. If a document designation is encountered that does not fit that
// description, the exception is thrown. Create a driver program to test the exception, allowing it
// to terminate the program.
import java.io.*;
import java.util.*;
public class HW2_Q4{
    public static void main(String[] args) {
    System.out.println("HW_Q4 Output Below!! \n");

    try{
        Scanner scan = new Scanner (new File("HW2_Q.java" ));
        //how can I make it take multiple files?
        // Read the data from the input file
        // while (scan.hasNext()){
            String docType = scan.next();
            if (docType.equalsIgnoreCase("u") || docType.equalsIgnoreCase("c") || docType.equalsIgnoreCase("p") ){
            System.out.println ("Document in right location");
            }
        // }
    }
    catch (Exception except){
        System.err.println(except);
        System.err.println("InvalidDocumentCodeException");
        }
    }

}
