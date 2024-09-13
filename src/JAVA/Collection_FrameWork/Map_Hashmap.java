package JAVA.Collection_FrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Hashmap {
    public static void main(String[] args) {
        Map<String ,Object> a=new LinkedHashMap();
        a.put("name","Praveen");
        a.put("name","manoj");
        a.put("Age",24);
        a.put("ismale",true);
        a.put(null,null);

       for (Object  item: a.entrySet()){
           System.out.println(item);
       }
    }
}
