package A_may.ex_21052024_Abstraction.abstraction.EX4_abstrct;

public class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

class runnerr {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Creating a Dog object

        // Upcasting: Assigning the Dog object to an Animal reference
        Animal myAnimal =new Animal();
        myAnimal=myDog;

        // Accessing the method using Animal reference
        myAnimal.makeSound(); // Outputs: Animal makes a sound
    }
}

