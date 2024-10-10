import java.util.Scanner;
public class MultiLevelInheritance {
    //MULTI-LEVEL INHERITANCE : CHAIN OF INHERITANCE.
    public static void main(String[] args) {
        Bat b = new Bat();

        b.eat();
    }
}//END PUBLIC CLASS.

//BASE-CLASS.
class Animal{
    String ecosystem;
    String skinColour ;
    
    void eat(){
        System.out.println("EATING...");     
    }

    void breath(){
        System.out.println("BREATHING....");
    }
}//END ANIMAL-CLASS.


//DERIVED-CLASS.
class Mammal extends Animal{
    int legcount;

    boolean isMilkGiving(){ 
        return true;
    }

}//END MAMMAL-CLASS.  

//DERIVED-CLASS.
class Bat extends Mammal{ //MULTI-LEVEL INHERITANCE.
    Scanner sc = new Scanner(System.in);
    String breed;

    void LayingEggs(){
        System.out.println("LAYING EGGS...");
    }

    void Flying(){ //MAMMALS LIKE BAT WILL FLY.
        System.out.println("FLYING...."); 
    }

    //CONSTRUCTURE.
    Bat(){
        System.out.println("ENTER ECOSTSTEM : ");
        this.ecosystem = sc.nextLine();

        System.out.println("ENTER SKIN-COLOUR : ");
        this.skinColour = sc.nextLine();

        System.out.println("ENTER NUMBER OF LEGS : ");
        this.legcount = sc.nextInt();

    }//END CONSTRUCTURE.
    
}//END BAT-CLASS