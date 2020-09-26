// Aaron Amankwaah
// 09/23/2020
// HW1-V2 #5

// Design a class Message that models an e-mail message. A message has a recipient, a sender, and
// a message text. Support the following methods:
// a. A constructor that takes the sender and recipient
// b. A method append that appends a line of text to the message body
// c. A method toString that makes the message into one long string like this: “From: Fname
// Lname\nTo: Some Recipient\n …”
// Write a driver program that uses this class to make a message and print it.

import java.util.ArrayList;

 class HW1_5{
    public static void main(String[] args) {
        System.out.println("This is Homeowrk 1 - Question #5. By Aaron Amankwaah, Output Below! \n");
        // Email name = new Email( SENDER, RECIEPieNT, SUBJECT );
        ArrayList<Email> emails = new ArrayList<Email>();
        Email test = new Email("aka110@rutgers.edu", "johnDoe@gmail.com", "HELLO!!!!!!!" );
        emails.add(test);
        test.message("You are awesome! \n\nSincerely, \nAaron Amankwaah.");
        System.out.println(test.toString());
    }

    public static class Email{
    private String sender, recepient, subject, emailMessage;
    
    public Email(String from, String to, String about ){
        sender = from;
        recepient = to;
        subject = about;
    }
    public void message(String text){
        emailMessage = text;
    }
    
    public String toString(){
        return  "From: " + sender + "\nTo " + recepient+ "\nAbout " + subject + 
        "\n\n"+  emailMessage ;
    }
}
}