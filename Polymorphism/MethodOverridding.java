//METHOD OVERRIDING : OVERWRITTING A METHOD WITH NEW FEATURES IN SUB-CLASS WHICH IS ALREADY PRESENT IN SUPER-CLASS.
public class MethodOverridding {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICIC i = new ICIC();
        Axis a = new Axis();

        s.getRateOfIntrest();
        i.getRateOfIntrest();
        a.getRateOfIntrest();
    }
}//end public class.

class Bank{
    void getRateOfIntrest(){
        System.out.println("RATE : 0%");
    }
}

class SBI extends Bank{
    void getRateOfIntrest(){ //OVERRIDDING
        System.out.println("RATE : 7%");
    }
}

class ICIC extends Bank{
    void getRateOfIntrest(){
        System.out.println("RATE : 9%");
    }
}

class Axis extends Bank{
    void getRateOfIntrest(){
        System.out.println("RATE : 10.5%");
    }
}