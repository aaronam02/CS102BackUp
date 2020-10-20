package HW2_Q2;

public class Student extends Person {
    private String major;

    // Student temi = new Student("Abibat", 2002, "Nursing");

    public Student(String NAME, int birthYear, String Major){
        super(NAME, birthYear);
        major = Major;
    }
    public String getMajor(){
        return major;
    }
    public String toString(){   
        return getName() + " was born in " + getBirthYear() + " and is majoring in " + getMajor();
    }
}
