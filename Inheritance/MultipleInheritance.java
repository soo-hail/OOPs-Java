public class MultipleInheritance {
    
    public static void main(String[] args) {
        
    }
}
interface Herbivorous{
    void eat();
}

interface Carnivorous{
    void eat(); //EAT FUNCTION ARE PRESENT IN BOTH HERBIVORE AND CARNIVORE. SO MULTIPLE INHERITANCE CAN BE ACHIVED BY ONLY INTERFACES BUT NOT WITH CLASSES.
}

class Dear implements Herbivorous, Carnivorous{
    public void eat(){
        System.out.println("EATS GRASS AND FLESH");
    }
}
