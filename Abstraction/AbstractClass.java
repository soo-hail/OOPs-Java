//ABSTRACT CLASS : ARE USED TO ACHIVE (0%- 100%) ABSTRCARION. AND ABSTRACT KEYWORD SHIULD BE USED.

public class AbstractClass{
    public static void main(String[] args) {
        // Animal a = new Animal() ; "OBJECT OF ABSTRACT CLASS CANNOT BE CREATED."

        Horse h = new Horse();
        h.walk();
        h.changeSkinColor();
        System.out.println(h.skinColor);

        Chicken c = new Chicken();
        c.walk();
    }
}

//ABSTRACT CLASS.
abstract class Animal{
    //CONSTRUCTURE.
    String skinColor;
    Animal(){ //CONSTRUCTURE OF ABSTRACT CLASS IS USED TO INITIALIZE THE PROPERTIES OF SUB-CLASS TO A DEFAULT VALUES.   
        skinColor = "Brown";
    }
    void eat(){
        System.out.println("EATING....");
    }

    abstract void walk(); //ABSTRACT CLASS. ---> TO ACHIVE ABSTARCTION(DATA HIDDING)
    abstract void breadth();  //ABSTRACT CLASS. ---> TO ACHIVE ABSTARCTION(DATA HIDDING)
}

class Horse extends Animal{
    void changeSkinColor(){
        skinColor = "Black";
    }
    void walk() {
        System.out.println("WALKS ON 4 LEGS");
        
    }
    void breadth() {
        System.out.println("BREADTHING");
    }
}

class Chicken extends Animal{
    void changeSkinColor(){
        skinColor = "White";
    }
    void walk(){
        System.out.println("WALKS ON 2 LEGS");
    }

    void breadth(){
        System.out.println("BREADTHING");
    }
}