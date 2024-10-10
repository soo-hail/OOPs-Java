// CLASS : is a blue print to create objects (or) collection of data members and members functions.
// OBJECTS : is a instance of class (or) real world entity which has physical extinces.

public class ClassesAndObjects {

    public void print(){
        System.out.println("ALLAH");
    }

    public static void main(String[] args) {
        Car c = new Car(); // CREATING OBJECT.
        System.out.println("LOOKING CAR....");
        c.looks();
        System.out.println();
        System.out.println("ENTERED IN CAR ");
        c.start();
        c.accerator();
        c.accerator();
        c.breaks();
        c.accerator();
        c.accerator();
        c.accerator();
        c.breaks();
        c.off();
        c.lock();
    }
}//END PUBLIC CLASS.

//CREATE CLASSES AFTER PUBLIC CLASS.
class Car { // BLUE PRINT OF A CAR.
    String model = "M800"; // MARUTHI 800.
    String color = "red";
    String wheel = "MRF";
    int seat = 4;
    static int maxSpeed = 120; // KMPH.
    int cc = 40; // capacity.

    void looks() {
        // System.out.println("MODEL : " + model);
        System.out.println("COLOUR : " + color);
        System.out.println("SEATS : " + seat);
        System.out.println("WHEELS : " + wheel);
    }

    void start() {
        System.out.println("CAR STARTED");
    }

    void accerator() {
        System.out.println("SPEED INCREASING....");
    }

    void breaks() {
        System.out.println("BREAK APPLIED");
    }

    void lock() {
        System.out.println("CAR LOCKED");
    }

    void off() {
        System.out.println("CAR OFFED!!");
    }
}