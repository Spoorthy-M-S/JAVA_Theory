package JAVA_Theory.SSTATIC;

public class block {
    static {
        System.out.println("First all the static blocks will be executed sequentially!!");
    }
    static {
        System.out.println("BLOCK-2");
    }

    public static void main(String[] args) {
        System.out.println("START");
    }

    static {
        System.out.println("BLOCK-2");
    }
}
