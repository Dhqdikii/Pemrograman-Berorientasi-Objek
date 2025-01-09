package Pert10.Hewan;

// Superclass
class Animal {
    // Properti
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Metode
    public void speak() {
        System.out.println("Animal speaks");
    }
}

// Subclass
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Memanggil constructor dari superclass
    }

    // Override metode speak
    @Override
    public void speak() {
        System.out.print("\033[H\033[2J");
        System.out.println(name + " SAYS WOOF");
    }
}

public class AnimalTester {
    public static void main(String[] args) {
        // Membuat objek dari subclass Dog
        Dog dog = new Dog("DOGGY");
        dog.speak(); // Output: Buddy says Woof
    }
}