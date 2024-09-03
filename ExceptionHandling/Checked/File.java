package JAVA_Theory.ExceptionHandling.Checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class File {
    public static void main(String[] args) {

        try {
            FileReader f = new FileReader("demo.txt");
           // throw f;
        } catch (FileNotFoundException e) {
            System.out.println("FildeReader Exception Handled");
        }

    }

}
