package JAVA.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static void main(String[] args) {
        try {
            FileReader f=new FileReader(new File("sdcv"));
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Its FileNotFoundException !!");
        }

        System.out.println("Hi");
    }
}
//Only in Checked Exception(JVM known issue) we can use throws type.
//only with function or method we can use throws Exception.