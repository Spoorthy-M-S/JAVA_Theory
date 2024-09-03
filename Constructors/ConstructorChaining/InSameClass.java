package JAVA_Theory.Constructors.ConstructorChaining;

public class InSameClass {
    InSameClass(){
        this(2);
        System.out.println("1");
    }
    InSameClass(int x){
        this(2.2);
        System.out.println("2");
    }
    InSameClass(double y){
        System.out.println("3");
    }
    public static void main(String[] args) {
        InSameClass c1=new InSameClass();
    }
}
