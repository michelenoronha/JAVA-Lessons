// Main class
public class DevelopmentEnvironment {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Development Environment!");
    }
}

// Structure and main components of a Java program
public class Main {
    public static void main(String[] args) {
        // Main execution point
        System.out.println("Hello, Java!");
    }
}

// Base class with getter and setter for the "name" attribute
public class Person {
    private String name;
    
    public void setName(String name) {    
        this.name = name;
    }
    
    public String getName() {    
        return this.name;
    }
}

// Switch-case example
public class ProgrammingLanguage {
    private String language = "JAVA";
    
    public void describeLanguage() {    
        switch (language) {
            case "C":
                System.out.println("C supports only structured programming.");
                break;
            case "C++":
                System.out.println("C++ supports both structured and object-oriented programming.");
                break;
            case "JAVA":
                System.out.println("Java supports only object-oriented programming.");
                break;
            default:
                System.out.println("Invalid language selection!");
                break;
        }
    }
}

