package JAVA_Theory.Encapsulation;

public class beanClass {
    public static void main(String[] args) {
        Emp e1=new Emp(11,"Abc");
        System.out.println(e1.getid());
        System.out.println(e1.getname());
    }
    
}
class Emp{
    private int id;
    private String name;
    Emp(int id,String name){//Constructors are used for instantiation and initilization
        this.id=id;
        this.name=name;
    }
    public int getid(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
}
