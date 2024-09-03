package JAVA_Theory.CustomException;
import java.util.*;
public class Example1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=10000;
        int amt=sc.nextInt();
        if(amt<=balance){
            balance-=amt;
        }
        else{
            try{
                RuntimeException e=new BankBalanceException();
                throw e;
            }
            catch(RuntimeException e){
                System.out.println("Insuffient balance");
            }
        }
        
    }
    
}
class BankBalanceException extends RuntimeException{

}
