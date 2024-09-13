package A_may.ex_21052024_Abstraction.abstraction.EX11_Abstract;

public abstract class Baseclass {
    abstract void openbrowser();
    abstract void closebrowser();

    void printlogs(){
        System.out.println("Logs");
    }
}
class Chrome extends Baseclass{
    @Override
    void openbrowser() {
        System.out.println("openbrowser");
    }

    @Override
    void closebrowser() {
        System.out.println("closebrowser");
    }

    public static void main(String[] args) {
        Baseclass c=new Chrome();
        c.openbrowser();
        c.closebrowser();
        c.printlogs();

    }
}