package A_may.ex_28052024_CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class TAddAll {
    public static void main(String[] args) {
        List <String> team=new ArrayList<>();
        team.add("India");
        team.add("Australia");

        List  rank=new ArrayList<>();
        rank.add(1);
        rank.add(2);

        team.addAll(rank);
        System.out.println(team);
    }
}
