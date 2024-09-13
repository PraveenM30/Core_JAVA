package A_may.ex_14052024_Constructor;

public class con5 {
    String club="India";
    String name;
    int age;
    float weight;

con5(){
    System.out.println("its a default constructor!");
}
    con5(String name1,int age1,float weight1){

        this.name=name1;
        this.age=age1;
        this.weight=weight1;
    }

    void details(){
        System.out.println("club name is -> "+ club);
        System.out.println("player name is -> "+name);
        System.out.println("player age is -> "+age);
        System.out.println("player weight is -> "+weight);
    }
}
