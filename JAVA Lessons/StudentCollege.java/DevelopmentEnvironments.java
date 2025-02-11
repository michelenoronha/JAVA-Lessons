 // Main class
 public class DevelopmentEnvironments {
    public static void main(String[] args) {
        System.out.println("Java Development Environment");
    }
}

// Structure and main commands of a Java program
public class Main {
    public static void main(String[] args) {
        // Main code
        System.out.println("Hello, Java!");
    }
}

// Base class with access methods for the "name" attribute
public class Base {
    private String name;
    
    public void setName(String name) {    
        this.name = name;
    }
    
    public String getName() {    
        return this.name;
    }
}

// Switch-case example
public class Language {
    private String language = "JAVA";
    
    public void controlFlow() {    
        switch (language) {
            case "C":
                System.out.println("Supports only structured programming");
                break;
            case "C++":
                System.out.println("Supports both structured and object-oriented programming");
                break;
            case "JAVA":
                System.out.println("Supports only object-oriented programming");
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}