public class HybrideInheritance {
    
    public static void main(String[] args) {
        // Sparrow s = new Sparrow();
        // s.sound();
        // s.fly();

        Male m = new Male();
        m.think();
        m.eat();
        m.mro();
    }
}

class Animal{
    void breadth(){
        System.out.println("BREADTHING.....");
    }

    void eat(){
        System.out.println("EATING.....");
    }
}

//LEVEL - 1
class Fish extends Animal{
    void swim(){
        System.out.println("SWIMMING.....");
    }
}

//LEVEL - 1
class Bird extends Animal{
    void fly(){
        System.out.println("FLYING.....");
    }
}

//LEVEL - 1
class Mammal extends Animal{
    void walk(){
        System.out.println("WALKING...");
    }
}

//LEVEL -2 
class Sparrow extends Bird{
    void sound(){
        System.out.println("KUCH..KUCH..KUCH..");
    }
}

//LEVEL - 2
class HomoSepian extends Mammal{
    void think(){
        System.out.println("THINKING..");
    }
}

//LEVEL - 3
class Male extends HomoSepian{
    void mro(){
        System.out.println("HARD.. HARDER.. HARDEST..");
    }
}

//LEVEL - 3
class Femal extends HomoSepian{
    void fro(){
        System.out.println("HARD.. HARDER.. HARDEST..");
    }
}

