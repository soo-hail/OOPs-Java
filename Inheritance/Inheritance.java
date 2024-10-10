public class Inheritance {
    //INHERITANCE IS A PROCESS OF PASSING PROPERTIES AND METHODS OF BASE-CLASS(PARENT-CLASS) TO BASE-CLASS(CHILD-CLASS).   
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}//END PUBLIC CLASS.

//BASE-CLASS.
class Animal{
    String ecosystem;
    String colour;

    void eat(){
        System.out.println("EATING...");
    }

    void breath(){
        System.out.println("BREATHING....");
    }
}//END BASE-CLASS.

//DERIVED CLASS(SUB-CLASS).
class Fish extends Animal{ //FISH-CLASS INHERITING PROPERTIES OF ANIMAL-CLASS
    int finsCount;

    void swim(){
        System.out.println("SWIMMING...");
    }
}
