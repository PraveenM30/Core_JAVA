package A_april.Operators;

public class Ternary {
    public static void main(String[] args) {
        //greatest of 2 number

//        int a=1;
//        int b=2;
//        int Greater=(a>b)?a:b;
//        System.out.println(Greater +"-> is the greatest number");

        //greatest of 3 number
        int a=11;
        int b=12;
        double b1 =400.2323456784d;
        float b2=(float)b1; //Explicit type casting
        int c=(int)b2;  //Explicit type casting
        System.out.println(c);

        int GreatestOf3Number=(a>b)?((a>c)?a:c):(b>c)?b:c;

        System.out.println(GreatestOf3Number +" -> is the greatest of 3 number");

    }
}
