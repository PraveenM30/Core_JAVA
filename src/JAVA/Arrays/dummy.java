package JAVA.Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class dummy {

    public static Integer[] removeDuplicate(Integer[] array) {

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(array));
        return set.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Integer numbers[]={1,1,2,2,3,3,444,55,55};
        Integer results[]=removeDuplicate(numbers);
        System.out.println(Arrays.toString(results));
    }
}