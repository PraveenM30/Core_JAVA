package A_may.ex_21052024_Abstraction.abstraction.interfaceKeyword;

public interface Engine {
    void startEngine();
    void stopEngine();

   default void haltingEngineJustStart(){
       System.out.println("Halt the Engine");
   }
    default void haltingEngineJustStop(){
        System.out.println("Halt the Engine");
    }
    static void M1(){
        System.out.println("M1");
    }
//    void m2(){
//        System.out.println("m2");
//    }
}
