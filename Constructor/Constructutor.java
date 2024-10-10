public class Constructutor {
    //CONSTRUCTURE IS A SPECIAL METHOD WITHOUT RETURN TYPE USED TO CREATE AND INITIALIZE THE OBJECTS.
        //NOTE : 1.NO RETURN TYPE  2.NAME OF CONSTRUCTURE SHOULD BE SAME AS CLASS NAME.
        //NOTE : WE CAN CREATE MULTIPLE CONSTRUCTURES IN A SINGLE CLASS ACCORDING TO OUR REQUIREMENTS WITH SAME NAME BUT DIFFER IN NO.OF ARGUMENTS. 
    public static void main(String[] args) {
        // Student s1= new Student(); //NON-PARAMITARIZED CONSTRUCTURES. 

        //Student s1 = new Student("SOHAIL", 1103, "BCA"); //PARAMITARIZED CONSTRUCTURE.

        Student s1 = new Student("SOHAIL",1102,"BCA"); //EXISTING OBJECT.
        Student s2 = new Student(s1); //COPY CONSTRUCTURE.

        s1.regNo = 1103;
        //AFTER WE CHANGE THE VALUES OF DATA-MEMBERS(NON-ARRAY) OF OLD OBJECT IT WILL NOT REFLECT ON NEW OBJECT.BECAUSE "VARIABLES ARE PASSED BY VALUE".

        s2.getInfo(); 


       
    }//END MAIN CLASS.
}//END PUBLIC CLASS

class Student{
    String name;
    int regNo;
    String comb; //COMBINATION.

    //DEFAULT CONSTRUCTURE : IS AUTOMATICALLY CREATED WHEN WE HAVE NOT DEFINED CONSTURCTURE IN CLASS.
/*---------------------------------------------------------------------------------------------------------------- */
    // NON-PARAMITARIZED CONSTRUCTURE : CONSTRUCTURE WITH NO PARAMETERS. IT IS USED TO CREATE A OBJECT AND INPUT/OUTPUT/PRINT SOMETHING.
    Student(){
        System.out.println("ADDMISSIONS ARE OPENDED.");
    }
/*---------------------------------------------------------------------------------------------------------------- */
    //PARAMITARIZED CONSTRUCTURES : CONSTRUCTURES WITH PARAMETERS. IT IS USED TO CREATE AND INITIALIZE OBJECTS.
    Student(String name,int regNo,String comb){
        this.name = name;
        this.regNo = regNo;
        this.comb = comb;    
    }

/*---------------------------------------------------------------------------------------------------------------- */
    //COPY CONSTRUCTURE : USED TO INITIALIZE DATA-MEMBERS OF OBJECT WITH EXISTING OBJECT.
    Student(Student s){
        this.name = s.name;
        this.regNo = s.regNo;
        this.comb = s.comb;
    }
/*---------------------------------------------------------------------------------------------------------------- */
    //GETINFO.
    void getInfo(){
        System.out.println("NAME : " + name);
        System.out.println("REGISTER NUMBER : " + regNo);
        System.out.println("COMBINATION : " + comb);
    }

}
