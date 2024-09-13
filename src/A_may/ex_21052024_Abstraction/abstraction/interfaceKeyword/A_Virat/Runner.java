package A_may.ex_21052024_Abstraction.abstraction.interfaceKeyword.A_Virat;

public class Runner implements Bat,Captain,Filed{
    @Override
    public void bat() {
        System.out.println("Virat is a great batter !");
    }

    @Override
    public void captain() {
        System.out.println("Kohli is a leader");
    }

    @Override
    public void filed() {
        System.out.println("Kohli is phenominal fielder");
    }

    public static void main(String[] args) {
        Runner r=new Runner();
        r.bat();
        r.filed();
        r.captain();
    }
}
