package JAVA_Theory.Casting.NonPrimitiveCasting;

public class Implicit {
    public static void main(String[] args) {
        Emp r1=new HR();
        System.out.println(r1); //fullyQualifiedClassName.hexadecimalValue
        r1.call(r1);
        }
    }
    class Emp{
        int id;
        String s;
        Emp(){
            System.out.println("Emp called");   
        }
        public Emp call(Emp obj){
            if(obj instanceof HR){
                HR ob1=new HR();
                return ob1;
            }
            else{
                return new Manager();
            }
        }
        @Override
        public String toString(){
            return "Empl";
        }
    }
    class HR extends Emp{
        HR(){
            System.out.println("HR_created");
        }
        public void view(){
            System.out.println("HR View");
        }
    
    }
    class Manager extends Emp{
        Manager(){
            System.out.println("Emp called");
        }
        public void view(){
            System.out.println("Manager");
        }
    
    
}
