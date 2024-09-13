package JAVA.Constructor;

public class A_person {
    String name;
    int age;

    A_person() {
        System.out.println("person DC");
    }

    A_person(String name) {
        this.name = name;
        System.out.println("person PC name is -> " + name);
    }

    A_person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("person 2 PC name is " + name + " & age is -> " + age);
    }
}

class person2 extends A_person {
    person2() {
        super("praveen", 24);

        System.out.println("person 2 DC");
    }
}

class runner {
    public static void main(String[] args) {
        person2 p = new person2();
    }
}
