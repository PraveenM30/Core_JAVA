package A_may.ex_25052024_Wrapper_Exception.Wrapper;

public class Wrapper2 {
    public static void main(String[] args) {

        Integer x = 400, y = 400;
        if (x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");
        //Not Same bcs in wrapper class x and y will be stored in diff object


        Integer a = Integer.valueOf(40), b = Integer.valueOf(40);
        if (a == b) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
        // In JVM - values range from -128 to 127 are cached in same object so output is Same.


        Integer aa = Integer.valueOf(10);
        Integer bb = 10;

        // Due to auto-boxing, a new Wrapper object
        // is created which is pointed by Y
        System.out.println(aa == bb);
//The value 10 falls within the range of cached Integer objects (-128 to 127), so the output is true
    }
}
