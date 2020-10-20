//Aaron Amankwaah
//HW2-Q2 10-20-2020
package HW2_Q3;

import java.util.ArrayList;

public class AppointmentTester {
    public static void main(String[] args) {
        Appointment hw = new Appointment("homework due for CS", 2020, 20, 20);
        Daily sleep = new Daily("homework due for CS", 2020, 20, 20);
        Monthly goHome = new Monthly("homework due for CS", 2020, 20, 20);
        Onetime skipClass = new Onetime("homework due for CS", 2020, 20, 20);

        appointments.add(hw);
        appointments.add(sleep);
        appointments.add(goHome);
        appointments.add(skipClass);

        System.out.println(occursOn(2020, 20, 20));

    }

}
