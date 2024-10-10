public class HeirarchialInheritance {
    
    public static void main(String[] args) {
        Fish f = new Fish();
        Bird b = new Bird();
        Mammal m = new Mammal();

        f.eat();
        b.eat();
        m.eat();
    }
}//END PUBLIC-CLASS.


class Animal{
    String skinColour;

    void eat(){
        System.out.println("EATING..."  );
    }

    void breath(){
        System.out.println("BREADTHING.....");
    }
}//END ANIAML-CLASS.

class Fish extends Animal{
    void swim(){
        System.out.println("SWIMMING....");
    }
}//END FISH-CLASS.


class Bird extends Animal{
    void fly(){
        System.out.println("FLYING....");
    }
}//END BIRD-CLASS.

class Mammal extends Animal{
    void walk(){
        System.out.println("WALKING.....");
    }
}//END MAMMAL CLASS.
