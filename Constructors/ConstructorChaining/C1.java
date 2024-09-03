package JAVA_Theory.Constructors.ConstructorChaining;
//The process of one const calling another
//IN same class can be achieved by Constructor overloading
//IN DIFFERENT CLASS=>By super()=>Keyword
//this()=>in same class
//super()
public class C1 {
    C1(){
        this(3);
        System.out.println("Student called1");
    }
    C1(int x){
        this(3.3);
        System.out.println("Student called2");
    }
    C1(double y){
        System.out.println("Student called3");
    }
    public static void main(String args[]){
        C1 c=new C1();
    }
}

