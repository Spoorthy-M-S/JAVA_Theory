package JAVA_Theory.ExceptionHandling.Checked;

import java.io.FileReader;

public class Class {

    public static void main(String[] args) {

        try {
            FileReader f = new FileReader("demo.txt");
        } catch (Exception e) {
            System.out.println("FildeReader Exception Handled");
        }

    }
}
