package HW2_Q2;

public class Instructor extends Person {
    private int salary;

    // Instructor david = new Instructor("David", 1968, 90000);

    public Instructor(String NAME, int birthYear, int sal){
        super(NAME, birthYear);
        salary = sal;
    }
    public int getSalary(){
        return salary;
    }
    public String toString(){   
        return getName() + " was born in " + getBirthYear() + " and earns " + getSalary();
    }
}