package A_may.ex_14052024_Constructor;

public class con1 {
    String name;
    int age;
    double salary;

    con1() {                 //Default constructor
        name = "praveen";
        age = 24;
    }

    con1(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void printDetails() {
        System.out.println("Emp Name -> " + name);
        System.out.println("Emp age -> " + age);
        System.out.println("Emp salary ->" + salary);
    }
}
