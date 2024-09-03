package JAVA_Theory.CustomException;

public class UsingThrow {

    public static void main(String[] args) {
        try{
            UserDefinedException e=new UserDefinedException();
            throw e;
        }
        catch(UserDefinedException e){
            System.out.println("Exception Handled");
        }
    }

}

class UserDefinedException extends Exception {

}
