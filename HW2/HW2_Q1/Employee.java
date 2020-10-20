package HW2_Q1;


// //Make a class Employee with a name and salary. Make a class Manager inherit from Employee.
// Add an instance variable, named department, of the type String, Supply a toString method that
// prints the manager’s name, department, and salary. Make a class Executive inherit from
// Manager. Supply appropriate toString methods for all classes. Provide a driver program,
// EmployeeTester, that tests these classes and methods.
public class Employee {
    String name;
    int salary;
//    Employee ceo = new Employee("tom", 20);
    //make array for employess

    public Employee (String nam, int sal){
        name = nam;
        salary = sal;
    }
    public String getName(){
    return name;
    }
    public int getSalary(){
    return salary;
    }
    public String toString(){
        return getName()+ " earns a salary of $"+ getSalary();
         }
}
