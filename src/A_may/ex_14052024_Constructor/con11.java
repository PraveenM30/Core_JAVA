package A_may.ex_14052024_Constructor;

public class con11 {
    public static void main(String[] args) {
        con1 a = new con1();
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.salary);


        con1 b = new con1("Praveen", 24, 29000);
        b.printDetails();

    }
}
