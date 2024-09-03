package JAVA_Theory.SSTATIC;

public class example {
    //Npn static block gets executed sequentially if object is created
    {
        System.out.println("BLOCK-1");
    }
    {
        System.out.println("Block-2");
    }
    public static void main(String[] args) {
        example e1=new example();
    }
    
}
