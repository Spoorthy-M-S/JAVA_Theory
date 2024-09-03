package JAVA_Theory.ExceptionHandling.Checked;

public class Interrupted {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException Handel");
            }
        }
    }

}
