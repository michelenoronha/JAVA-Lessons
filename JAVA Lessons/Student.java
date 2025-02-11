import java.util.Random;

// Definition of the Student class
public class Student {
    private String name;
    private int age;
    private double identifierCode;
    private Random randomGenerator;

    // Class constructor
    public Student(String name, int age) {
        this.randomGenerator = new Random();
        this.name = name;
        this.age = age;
        this.identifierCode = randomGenerator.nextDouble(); // Generates a unique identifier
    }

    // Method to set the student's name
    public void setName(String name) {
        this.name = name;
    }

    // Method to retrieve the student's name
    public String getName() {
        return this.name;
    }
    
    // Method to retrieve the student's age
    public int getAge() {
        return this.age;
    }
    
    // Method to retrieve the unique identifier
    public double getIdentifierCode() {
        return this.identifierCode;
    }
    
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Fernanda", 20);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Identifier Code: " + student.getIdentifierCode());
    }
}

// Example of an abstract class
public abstract class Test {}

// Example of an abstract class with annotations and interfaces
@Deprecated
@SuppressWarnings("deprecation")
public abstract class AdvancedStudent {
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}