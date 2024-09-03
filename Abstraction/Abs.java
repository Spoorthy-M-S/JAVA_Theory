package JAVA_Theory.Abstraction;

public class Abs {
    public static void main(String[] args) {
        Bank a1=new ATM(3000);
        ATM a=(ATM)a1;
        System.out.println(a1.checkBalance());
    }
}
interface Bank{
    void deposit(int a);
    void withdraw(int a);
    int checkBalance();
}
class ATM implements Bank{
    int balance=0;
    ATM(int b){
        this.balance=b;
    }
    @Override
    public void deposit(int a){
    balance+=a;
    }
    public void withdraw(int a){
        balance-=a;
    }
    public int checkBalance(){
        return balance;
    }

}