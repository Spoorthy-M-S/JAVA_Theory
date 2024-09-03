package JAVA_Theory.Methods.overloading;
class M1{
    //BOTH STATIC AND NON STATIC METHOD CAN BE OVERLOADED

    static void read(){
        System.out.println("STATIC METHOD 1");
    }
    static void read(int x){
        System.out.println("STATIC METHOD 2");
    }
    void write(){
        System.out.println("NON-STATIC M 1");
    }
    void write(int x){
        System.out.println("NON-STATIC M 2");
    }

    public static void main(String[] args) {
        M1 s=new M1();
        s.write();
        read();//INTERNALLY m1.read()=>will be called
    }
}