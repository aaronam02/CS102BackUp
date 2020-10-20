package HW2_Q2;

// Implement a superclass Person. Make two classes, Student and Instructor, that inherit from
// Person. A person has a name and year of birth. A student has a major, and an instructor has a
// salary. Write the class declarations, the constructors, and the methods toString for all classes.
// Write s driver program to test these classes and methods.
public class Person {
    String name;
    int yearOfBirth;

    // Person aaron = new Person("Aaron", 2002);

    Person(String NAME, int birthYear){
        name = NAME;
        yearOfBirth = birthYear;
    }

    public String getName(){
        return name;
    }
    public int getBirthYear(){
        return yearOfBirth;
    }

    public String toString(){   
        return getName() + " was born in " + getBirthYear();
    }
}
