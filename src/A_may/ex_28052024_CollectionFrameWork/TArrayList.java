package A_may.ex_28052024_CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class TArrayList {
    public static void main(String[] args) {
        List team = new ArrayList();
        team.add("India");
        team.add(123);
        team.add(true);
        team.add(12.12345);

        for (Object obj:team){
            System.out.println(obj);
        }


    }
}
