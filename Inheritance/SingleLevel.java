public class SingleLevel {
    
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}//end public class.

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
