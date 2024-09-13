package A_may.ex_14052024_Constructor;

public class con55 {
    public static void main(String[] args) {
        con5 c = new con5("praveen", 24, 63f);
        System.out.println(c.club);
        System.out.println( c.name);
        System.out.println(c.weight);
        System.out.println(c.age);

        c.details();

        con5 d=new con5();
    }
}
