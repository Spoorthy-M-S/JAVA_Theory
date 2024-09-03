package JAVA_Theory.Methods.overloading;

public class M2 {
    public static void main(String[] args) {
        sem1 s1=new sem1();
        s1.read();
    }
}
class Student{
    void read(){
        System.out.println("Student");
    }
}
class sem1 extends Student{
    void read(){
        super.read();
        System.out.println("Sem1 class!");
        super.read();
    }
}
//but in construction chaining this is not possible
//using super() is not supporter after performing some work
