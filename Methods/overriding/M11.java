package JAVA_Theory.Methods.overriding;

public class M11 {

    public static void main(String[] args) {
        son s1=new son();
        s1.bike();
    }
    
}
class father{
    void bike(){
        System.out.println("OLD BIKE");
    }
}
class son extends father{
    void bike(){
        System.out.println("ADDED NEW FEATURES");
    }
}
