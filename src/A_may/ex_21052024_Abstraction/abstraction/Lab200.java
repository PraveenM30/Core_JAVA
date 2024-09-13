package A_may.ex_21052024_Abstraction.abstraction;

public class Lab200 {
}


class Pramod extends B1{
    @Override
    void mtb() {

    }

    @Override
    public void atb() {
        System.out.println("ATB Completed");
    }
}

abstract class B1 implements Course{
    abstract void mtb();

}

interface Course{
    void atb();
}
