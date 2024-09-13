package A_april.ex_20042024_string;

public class str1 {
    public static void main(String[] args) {

        /* string is a java class file, which is called as immutable in nature bcs once the
         values is assigned we can't modify the value.

         2 ways we can declare the string
         1. Using New keyword
         2. Direct initialization and Declaration (Assignment operator)
         */



        String player="Virat Kohli";
        String saviour="Virat Kohli";
        System.out.println(player);
        System.out.println(player==saviour);
        /*true, if the value is same then both the object will check one object
         and == will verify the object address.
        */
        System.out.println(player.equals(saviour));
        //true, bcs it will verify the values of that object




        String captain=new String("King Kohli");
        String fearlesscaptain =new String("King Kohli");

        System.out.println(captain);
        System.out.println(captain==fearlesscaptain);
        /*false, bcs for every new keyword different object be created.
         and == will verify the object address.
        */
        System.out.println(captain.equals(fearlesscaptain));
        //true, bcs it will verify the values of that object
    }
}
