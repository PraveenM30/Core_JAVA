package A_may.ex_18052024_Encapsulation.poly.methodoveridding;

public class father {
    void light(){
        System.out.println("Halogen light");
    }
}

class son extends father{
    @Override
    void light(){
        System.out.println("LED light");
    }
}

class runner{
    public static void main(String[] args) {
//        father f=new father();
//        f.light();
//
//        son s=new son();
//        s.light();
//
//        f=s;
//        f.light();
        father f=new son();
        f.light();
    }
}
