import java.util.Calendar;

// Parent class Person
public class Person {
    private String name;
    private int age;
    private Calendar birthDate;
    private long CPF;
    private Address address;

    public Person(String name, Calendar birthDate, long CPF, Address address) {
        this.name = name;
        this.birthDate = birthDate;
        this.CPF = CPF;
        this.address = address;
        updateAge();
    }

    protected void updateName(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }

    protected void updateAge() {
        this.age = calculateAge();
    }

    protected int getAge() {
        return this.age;
    }

    protected void updateCPF(long CPF) {
        this.CPF = CPF;
    }

    protected long getCPF() {
        return this.CPF;
    }

    protected void updateAddress(Address address) {
        this.address = address;
    }

    protected Address getAddress() {
        return this.address;
    }

    private int calculateAge() {
        int gap;
        Calendar today = Calendar.getInstance();
        gap = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if ((birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH)) ||
            (birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH) &&
             birthDate.get(Calendar.DATE) > today.get(Calendar.DATE))) {
            gap--;
        }
        return gap;
    }
}

// Address class
class Address {
    private String country, state, city, street, number, complement;
    private int zipCode;

    public void setCountry(String country) { this.country = country; }
    public void setState(String state) { this.state = state; }
    public void setCity(String city) { this.city = city; }
    public void setStreet(String street) { this.street = street; }
    public void setNumber(String number) { this.number = number; }
    public void setZipCode(int zipCode) { this.zipCode = zipCode; }
    public void setComplement(String complement) { this.complement = complement; }
}

// Student class
public class Student extends Person {
    private String enrollment;

    public Student(String name, Calendar birthDate, long CPF, Address address) {
        super(name, birthDate, CPF, address);
    }
}

// Employee class
public class Employee extends Person {
    protected String enrollment;
    private Calendar hiringDate, terminationDate;

    protected Employee(String name, Calendar birthDate, long CPF, Address address) {
        super(name, birthDate, CPF, address);
        this.enrollment = generateEnrollment();
        hiringDate = Calendar.getInstance();
    }

    public void terminateEmployee() {
        terminationDate = Calendar.getInstance();
    }

    protected String generateEnrollment() {
        return "Enrollment not defined.";
    }

    protected String getEnrollment() {
        return this.enrollment;
    }
}

// Professor class (needed for inheritance)
public class Professor extends Employee {
    public Professor(String name, Calendar birthDate, long CPF, Address address) {
        super(name, birthDate, CPF, address);
    }
}

// Director interface (just for demonstration)
public interface Director {
    void manage();
}

// CommissionedProfessor class
public class CommissionedProfessor extends Professor implements CommissionedProfessorInterface {
    public CommissionedProfessor(String name, Calendar birthDate, long CPF, Address address) {
        super(name, birthDate, CPF, address);
    }

    @Override
    public void manage() {
        System.out.println("Managing as a Director.");
    }
}

// CommissionedProfessorInterface
public interface CommissionedProfessorInterface extends Director {
    // Additional methods can be defined here
}

// Main class
public class Main {
    private static Student student;
    private static Address address;

    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(1980, Calendar.NOVEMBER, 23);

        address = new Address();
        address.setCountry("Brazil");
        address.setState("RJ");
        address.setCity("Rio de Janeiro");
        address.setStreet("Avenida Rio Branco");
        address.setNumber("156A");
        address.setZipCode(20040901);
        address.setComplement("Block 03 - Apt 20.005");

        student = new Student("Marco Antônio", date, 901564098L, address);
        student.updateAge();
        
        System.out.println("Student Age: " + student.getAge()); // Exibe a idade do aluno
    }
}
