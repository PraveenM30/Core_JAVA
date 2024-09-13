package A_may.ex_18052024_Encapsulation.poly.methodoverloading;

public class overloading1 {
    public void add(){
        System.out.println("Default constructor");
    }
    public void add(int a){
        System.out.println("single parameter");
    }
    public void add(int a, int b){
        System.out.println("2 parameter");
    }

    public static void main(String[] args) {
        overloading1 a=new overloading1();
        a.add();
        a.add(10);
        a.add(10,20);
    }
}
