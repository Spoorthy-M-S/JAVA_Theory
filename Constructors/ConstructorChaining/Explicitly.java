package JAVA_Theory.Constructors.ConstructorChaining;

public class Explicitly {
    public static void main(String[] args) {
        
    }
}
class Animal{
    Animal(int x){

    }
}
class Fish extends Animal{
Fish(){
    super(1);
}
}
//IF WE NOT EXPLICITLY DO THIS THEN  COMPILE TIME ERROR OCCURS