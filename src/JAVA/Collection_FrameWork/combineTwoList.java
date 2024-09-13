package JAVA.Collection_FrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class combineTwoList {
    public static void main(String[] args) {

        List Student1=new ArrayList();
        Student1.add("Name is Praveen");
        Student1.add("Age is "+24);


        List Student2=new LinkedList();
        Student2.add("name is manoj");
        Student2.add("Age is "+23);

        Student1.addAll(Student2);
        System.out.println(Student1);

    }
}
