package A_may.ex_21052024_Abstraction.abstraction.EX1;

import A_may.ex_21052024_Abstraction.abstraction.CarEx.Lab197;

public class runner {
    static   Object obj ;
    static   Object obj1 ;
    static Lab197 obj3 ;
    static
    {
        obj1 = new String("somerefrence");
        obj3 = new Lab197();
    }


    {


    }

    public static void referenceAssign()
    {
        obj = new Test1Extend();

    }

//    public static void main(String[] args) {
//
//
//        Test1Extend t1=new Test1Extend() ;
//       obj = t1.refevalue ;
//
//
//
//    }

}

class VaraibleAccess
{
    public static void main(String[] args) {

        runner.obj3.printing();
        System.out.println();
        //classname.rerence.

    }

}
