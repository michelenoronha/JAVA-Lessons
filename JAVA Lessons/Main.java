// Parent class
class Vehicle {
    String brand = "Generic Vehicle";  // Attribute

    void honk() {  // Method
        System.out.println("Beep! Beep!");
    }
}

// Child class (inherits from Vehicle)
class Car extends Vehicle {
    int wheels = 4; // Extra attribute for Car

    void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of wheels: " + wheels);
    }
}

// Parent class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the makeSound() method
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Test Vehicle and Car classes
        Car myCar = new Car();
        myCar.honk();  // Inherited method from Vehicle
        myCar.displayCarInfo();  // Method from Car class

        System.out.println(); // Just to separate outputs

        // Test Animal and Dog classes
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Output: Some generic animal sound

        Dog myDog = new Dog();
        myDog.makeSound();  // Output: Woof! Woof!
    }
}
