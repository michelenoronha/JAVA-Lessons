import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Abstract class
abstract class Animal {
    // Abstract method
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println("Zzzz...");
    }
}

// Concrete subclass
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark!");
    }
}

// Concrete subclass
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.sleep();    

        cat.makeSound();  
        cat.sleep();      
    }
}

// Grouping objects in Java
class Student {
    // Attributes    
    private String id, name, nationality;
    
    // Constructor
    public Student(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%s)", name, nationality);
    }
    
    class School {
        // Attributes
        private String name, CNPJ;   
        private Address address;
        private List<Department> departments;
        private List<Student> students;
        
        // Constructor
        public School(String name, String CNPJ) {
            this.name = name;
            this.CNPJ = CNPJ;
            this.departments = new ArrayList<>();
            this.students = new ArrayList<>();
        }
        
        public void createDepartment(String departmentName) {
            departments.add(new Department(departmentName));
        }
        
        public void closeDepartment(Department department) {
            departments.remove(department);
        }
        
        public void enrollStudent(Student newStudent) {
            students.add(newStudent);
        }
        
        public void withdrawStudent(Student student) {
            students.remove(student);
        }
        
        public void groupStudentsByNationality() {
            Map<String, List<Student>> grouping = new HashMap<>();
            for (Student s : students) {
                grouping.computeIfAbsent(s.getNationality(), k -> new ArrayList<>()).add(s);
        }
        System.out.println("Grouping result by nationality: " + grouping);
    }
}

public class Principal {
    // Attributes
    private static Student student1, student2, student3, student4, student5, student6, student7, student8, student9;
    private static School school;
    
    // Main method
    public static void main(String[] args) {
        school = new School("Pedro Álvares Cabral School", "42.336.174/0006-13");
        createStudents();
        enrollStudents();
        school.groupStudentsByNationality();
    }
    
    // Methods
    private static void createStudents() {
        student1 = new Student("Marco Antônio", "Rio de Janeiro");
        student2 = new Student("Clara Silva", "Rio de Janeiro");
        student3 = new Student("Marcos Cintra", "Sorocaba");
        student4 = new Student("Ana Beatriz", "Barra do Pirai");
        student5 = new Student("Marcio Gomes", "São Paulo");
        student6 = new Student("João Carlos", "Sorocaba");
        student7 = new Student("César Augusto", "São Paulo");
        student8 = new Student("Alejandra Gomez", "Madrid");
        student9 = new Student("Castelo Branco", "São Paulo");
    }
    
    private static void enrollStudents() {
        school.enrollStudent(student1);
        school.enrollStudent(student2);
        school.enrollStudent(student3);
        school.enrollStudent(student4);
        school.enrollStudent(student5);
        school.enrollStudent(student6);
        school.enrollStudent(student7);
        school.enrollStudent(student8);
        school.enrollStudent(student9);
    }
}