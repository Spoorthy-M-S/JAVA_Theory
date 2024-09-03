package JAVA_Theory.ExceptionHandling.RunTimeException;

public class ArithmaticEx {
    public static void main(String[] args) {
        System.out.println("-----------------START-------------");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by Zero is Arithmetic Exception");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("----------------END-----------------");
    }
    
}
