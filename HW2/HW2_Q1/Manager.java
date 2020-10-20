package HW2_Q1;

public class Manager extends Employee {
    private String department;
    
// Manager manager = new Manager("Jake", 90000, "Information Technology");
//make array for managers

public Manager (String name, int salary, String dept){
    super(name, salary);
    department= dept;
    }
    
    // toString();
    public String getDept(){
        return department;
    }
    public String toString(){
    return getName()+ " earns a salary of $"+ getSalary() + " as a(n) "+ getDept();
    }
}

