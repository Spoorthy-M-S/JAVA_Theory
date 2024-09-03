package JAVA_Theory.ExceptionHandling.RunTimeException;

public class NullPointer {
    public static void main(String[] args) {
        String s = null;
        //System.out.println(s.length());
        try {
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

}
