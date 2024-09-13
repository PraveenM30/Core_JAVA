package JAVA.Constructor;

public class Father {
    String money = "20 lakh RS!";

    void house() {
        System.out.println("Hi son i need this money "+ this.money +"to build house");
    }
}

class Child extends Father {
    String money = "3 lakh!";
    String clg = "M tech";

    void study() {
        System.out.println("Hi dad i need to study -> "+this.clg+" give me ->" + super.money + " and i have some money of ->" + this.money);
        super.house();

    }

}

class runne {
    public static void main(String[] args) {
        Child c = new Child();
        c.study();

    }
}
