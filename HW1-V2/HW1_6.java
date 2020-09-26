// Aaron Amankwah
// 09/26/2020
// HW1-V2-Q#6

// Design a class Mailbox that stores e-mail messages, using the Message class from the previous
// exercise. Implement the following methods:
// a. public void addMessage(Message m)
// b. public Message getMessage(int i)
// c. public void removeMessage(int i)
// import HW1_5.java;
import java.util.ArrayList;

import HW1_5;

public class HW1_6 extends HW1_5 {
    public static void main(String[] args) {
        System.out.println("This is Homeowrk 1 - Question #5. By Aaron Amankwaah, Output Below! \n");
        ArrayList<Mailbox> emails = new ArrayList<Mailbox>();
        Email test = new Email("aka110@rutgers.edu", "johnDoe@gmail.com", "HELLO!!!!!!!" );
        // emails.add(test);
        addMessage(test);

        System.out.println(getMessage(1));
    }

    public static class Mailbox {
        ArrayList<Email> emails = new ArrayList<Email>();
    }
    public void addMessage(Email m){
        emails.add(m);
    }
    public Email getMessage(int i){
        emails.get(i);
    }
    public void removeMessage(int i){
        emails.remove(i);
    }
    }

