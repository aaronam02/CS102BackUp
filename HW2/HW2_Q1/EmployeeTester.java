//Aaron Amankwaah
//HW2-Q1 10-20-2020
package HW2_Q1;

// //Make a class Employee with a name and salary. Make a class Manager inherit from Employee.
// Add an instance variable, named department, of the type String, Supply a toString method that
// prints the manager’s name, department, and salary. Make a class Executive inherit from
// Manager. Supply appropriate toString methods for all classes. Provide a driver program,
// EmployeeTester, that tests these classes and methods.

public class EmployeeTester {
    public static void main(String[] args) {
        System.out.println("HW2-Q1 Sample Output Below \n");

        Employee ceo = new Employee("Tom", 200000);
        Manager manager = new Manager("Jake", 400000, "Information Technology");
        Executive executive = new Executive("Chris", 23000, "Payroll Assistant");
        System.out.println(ceo.toString());
        System.out.println(manager.toString());
        System.out.println(executive.toString());
    }
}
