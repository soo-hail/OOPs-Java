public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
    }
}

class Animal{
    String skinColor;
    public void eat(){
        System.out.println("EATING..");
    }
}

class Horse extends Animal{
    public void eat() {
        super.skinColor = "Brown"; //ACESSING DATA-MEMBER OF SUPER-CLASS
        System.out.println("EATING BREAD..");
        super.eat(); //ACESSING MEMBER-FUNCTION OF SUPER-CLASS. 
    }
}
