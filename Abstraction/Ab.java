package JAVA_Theory.Abstraction;

public class Ab {
    public static void main(String[] args) {
        Emp t1=new Tester("ABC", 10);
        t1.name();
    }
    
}
abstract class Emp{
    abstract void name();
    String name;
    int id;
}
class Tester extends Emp{
    Tester(String name,int id){
        this.id=id;
        this.name=name;
    }
    @Override
    void name(){
        System.out.println("Empl name:"+name+"Emp ID"+id);
    }
}

