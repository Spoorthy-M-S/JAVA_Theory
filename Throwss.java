package JAVA_Theory;
public class Throwss {
    public static void main(String[] args) {
        try{
            disp();
        }
        catch(Exception e){
            System.out.println("Exception handled!!!!!!!!!");
        }
        
    }
    public static void disp() throws Exception{
        System.out.println("THROWS IS A KEYWORD");
        System.out.println(6/0);

    }
    
}

//C:\JavaTheory\JAVA_Theory\Abstraction