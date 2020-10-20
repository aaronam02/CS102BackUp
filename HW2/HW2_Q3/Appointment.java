package HW2_Q3;



// Implement a superclass Appointment and subclasses Onetime, Daily, and Monthly. An
// appointment has a description (for example, “see the dentist”) and a date. Write a method
// occursOn (int year, in month, in day) that checks whether the appointment occurs on that date.
// For example, for a monthly appointment, you must check the day of the month matches. Then
// fill an array of Appointment objects with a mixture of appointments. Have the user enter a date
// and print out all appointments that occur on that date.
import java.util.ArrayList;

public class Appointment {
    String event;
    int year, month, day;

    // Appointment("homework due for CS", 2020, 20, 20);

    public Appointment(String details, int eventYear,int eventMonth, int eventDay){
        event = details;
        year = eventYear;
        month = eventMonth;
        day = eventDay;
    }

    public String getEvent(){
        return event;
    }
    public int getYear(){
        return year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }

    public String toString(){
        return getEvent() + " happens on mm/dd/yyy" + getMonth()+ "/"+ getDay()+ "/" +getYear();
    }
    public static Appointment occursOn(int year, int mon, int day ){
        ArrayList<Appointment> eventsOnDay = new ArrayList<Appointment>();
        for (int i = 0; i< appointments.size(); i++){
            if((appointments.get(i).getYear()== year) && (appointments.get(i).getMonth()== mon) && (appointments.get(i).getDay()== day)){
            System.out.println(appointments.get(i));
            eventsOnDay.add(appointments.get(i));
            }
        }
        return eventsOnDay;
    }

}
