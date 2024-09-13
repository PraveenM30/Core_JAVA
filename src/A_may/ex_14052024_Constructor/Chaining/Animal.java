package A_may.ex_14052024_Constructor.Chaining;

public class Animal {
    String type;

    Animal() {
        System.out.println("Animal DC");
    }

    Animal(String typee) {
        this.type = typee;
    }
}

class Dog extends Animal {
    String type;
    String breed;

    Dog() {
        System.out.println("Dog DC");
    }
    Dog(String typee){
        super.type=typee;
    }

     Dog(String breedd,String typeee) {
        this.type=typeee;
        this.breed = breedd;
    }

    void display() {
        System.out.println("Type  " + this.type + "  breed-> " + this.breed);
    }
}

class runner {
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog d2 = new Dog("pit bull","Dog type");
        d2.display();
        Dog d3=new Dog("human");
        d3.display();
    }
}