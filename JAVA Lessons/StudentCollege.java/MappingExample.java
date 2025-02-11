package Student; // Nome do pacote corrigido

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsAPI {
}

// Classe School
class School {
    // Atributos
    private String name, CNPJ;
    private Address address;
    private List<Department> departments;
    private List<Student> students;

    // Construtor
    public School(String name, String CNPJ) {
        this.name = name;
        this.CNPJ = CNPJ;
        this.departments = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Métodos
    public void createDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public void closeDepartment(Department department) {
        departments.remove(department);
    }

    public void enrollStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void suspendStudent(Student student) {
        students.remove(student);
    }

    // Agrupando estudantes por nacionalidade (primeira assinatura)
    public void groupStudents() {
        Map<String, List<Student>> grouping = students.stream()
                .collect(Collectors.groupingBy(Student::getNationality));

        System.out.println("Grouping result by nationality:");
        grouping.forEach((key, list) -> System.out.println(key + " = " + list));
    }

    // Agrupando estudantes com um conjunto (segunda assinatura)
    public void groupStudents(int a) {
        Map<String, Set<Student>> grouping = students.stream()
                .collect(Collectors.groupingBy(Student::getNationality, Collectors.toSet()));

        System.out.println("Grouping result by nationality:");
        grouping.forEach((key, set) -> System.out.println(key + " = " + set));
    }

    // Agrupando estudantes usando TreeMap (terceira assinatura)
    public void groupStudents(double a) {
        Map<String, Set<Student>> grouping = students.stream()
                .collect(Collectors.groupingBy(Student::getNationality, TreeMap::new, Collectors.toSet()));

        System.out.println("Grouping result by nationality:");
        grouping.forEach((key, set) -> System.out.println(key + " = " + set));
    }
}

// Classe Department (necessária para o código funcionar)
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Classe Student (necessária para o código funcionar)
class Student {
    private String name;
    private String nationality;

    public Student(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return name + "(" + nationality + ")";
    }
}

// Classe MappingExample
public class MappingExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = map(numbers, x -> x * x);
        
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Squared Numbers: " + squaredNumbers);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        List<R> result = new ArrayList<>();
        for (T item : list) {
            R mappedItem = mapper.apply(item);
            result.add(mappedItem);
        }
        return result;
    }
}
