package JAVA.Constructor;

public class ex1 {
    String name;
    int age;
    public ex1(String n,int a){
        name=n;
        age=a;
        System.out.println(name);
    }

    public static void main(String[] args) {
        ex1 e=new ex1("praveen",24);

    }
}
