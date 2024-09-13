package Ruff;

public class Upcasting {
        void animal(){
            System.out.println("Animal will rum!");
        }
    }

    class Upcasting1 extends Upcasting {
        void bird() {
            System.out.println("Bird's can fly! ");
        }
//        void animal(){
//            System.out.println("method overided!");
//        }

    }
    class runners {
        public static void main(String[] args) {
           Upcasting a=new Upcasting1();//Upcasting
            a.animal();



            Upcasting1 b= (Upcasting1) a; //downcasting
            b.bird();
            b.animal();
        }
    }

