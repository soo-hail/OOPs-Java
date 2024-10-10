public class MethodOverloading{

    //METHOD OVERLOADING : MULTIPLE FUNCTIONS WITH SAME NAME BUT DIFFER IN TYPE OF PARAMETERS OR NO. OF PARAMETERS.
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1.5f,2.5f));
        System.out.println(c.sum(2,4,6));
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}