package JAVA_Theory.SSTATIC;

public class method {
    static void calculate(int a ,int b){
        System.out.println((a+b));
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        calculate(3, 10);
        method m1=new method();
        m1.sum(1, 9);
    }
}
