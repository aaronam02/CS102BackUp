//Aaron Amankwaah
//HW2-Q2 10-20-2020
package HW2_Q2;

public class PersonTester {
    public static void main(String[] args) {
        System.out.println("HW2-Q2 Sample Output Below \n");
        Person aaron = new Person("Aaron", 2002);
        Student temi = new Student("Abibat", 2002, "Nursing");
        Instructor david = new Instructor("David", 1968, 90000);

        System.out.println(aaron.toString());
        System.out.println(temi.toString());
        System.out.println(david.toString());
    }
}
