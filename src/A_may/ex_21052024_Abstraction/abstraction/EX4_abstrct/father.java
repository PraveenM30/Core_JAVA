package A_may.ex_21052024_Abstraction.abstraction.EX4_abstrct;

public class father {
    void light () {
        System.out.println("Halogen light");
    }
}
    class son extends father{
         void light() {
            System.out.println("LED light");
        }
    }

class runner {
    public static void main(String[] args) {
        son s=new son();
       s.light();
        father f=new father();
        f.light();
        father ff=new son();
        ff.light();
        f=s;
        f.light();
    }
}
