package JAVA_Theory.Constructors.ConstructorChaining;
//IMPLICITLY CALLED WITHOUT USING SUPER KEYWORD
class InDifferentClass {
    public static void main(String[] args) {
        Fish f1=new Fish();
    }
}
class Animal{
    Animal(){
        System.out.println("Animal called");
    }
}

class Fish extends Animal{
    Fish(){
        System.out.println("Fish called!");
    }
}