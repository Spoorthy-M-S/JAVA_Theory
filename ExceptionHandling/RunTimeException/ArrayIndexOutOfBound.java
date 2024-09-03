package JAVA_Theory.ExceptionHandling.RunTimeException;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        try{
            System.out.println(arr[8]);//SPECIFIC EXCEPTION HANDELR
            //INTERNALLY
            //ArrayIndexOutOfBoundException e=>object will be created
            //throw e=>Takes place
        }
        catch(Exception e){
            System.out.println("Array Index Out of bound exception");
            System.out.println("Generalized exception Handle\n ClassCast Exception\n OccursUpcasting takes place");
            //Generalized exception Handler
            //ClassCast Exception Occurs
            //Upcasting takes place
        }
    }
}
