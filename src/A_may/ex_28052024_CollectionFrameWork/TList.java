package A_may.ex_28052024_CollectionFrameWork;

import java.util.List;

public class TList {
    public static void main(String[] args) {
        List batsman=List.of("Rohith","Rohith","Virat","Virat","surya","Pant",18,45);
        System.out.println(batsman);
        System.out.println("size is -> "+batsman.size());
        System.out.println(batsman.get(2));
        System.out.println(batsman.isEmpty());
//        batsman.add("Bumrah");
//        System.out.println(batsman);
//        batsman.remove(0);
//        System.out.println(batsman);


        //we cannot add/remove/clear any data in the list once it is declared.
        //we can add heterogeneous datatype values in the List.
    }
}
