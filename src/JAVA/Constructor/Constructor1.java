package JAVA.Constructor;

public class Constructor1 {
    String name;
    int age;
    String role;

    //Zero parameterized constructor
    Constructor1() {
        System.out.println("Student details !!");
    }

    //parameterized constructor
    public Constructor1(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
        System.out.println("Employee name ->" + name + " E_age ->" + age + " E_role ->" + role);

    }
}
class runner12 {
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1();
        Constructor1 c = new Constructor1("Praveen", 24, "QA");
    }
}
