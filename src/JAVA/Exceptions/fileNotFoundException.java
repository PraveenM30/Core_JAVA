package JAVA.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class fileNotFoundException {
    public static void main(String[] args) {
        try {
            String path = "hgv";
            File f = new File(path);
            FileReader fr = new FileReader(f);
        } catch (FileNotFoundException f) {
            System.out.println("File Not founf Exception !!");
        }
    }
}
