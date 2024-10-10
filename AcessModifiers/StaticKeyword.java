//STATIC KEYWORD IS USED FOR COMMON DATA MEMBERS OF ALL OBJECTS DERIVED FROM SAME CLASS.
   //NOTE : IF WE CHANGE VALUE OF STATIC DATA-MEMBER THEN THAT WILL REFLECT FOR ALL OBJECTS DERIVED FROM SAME CLASS

   //NOTE : FUNCTIONS/METHODS WITH STATIC KEY WORD CAN BE CALLED WITHOUT CREATING OBJECT.
   //  NESTED-CLASS WITH STATIC KEYWORD CAN BE CALLED WITHOUT CREATING OBJECT.
public class StaticKeyword {
    
    public static void main(String[] args) {
        Student s = new Student("SOHAIL", 1103);
        Student s1 = new Student("ASHWATHI", 1104); 
        s1.college = "DEEKSHA";//IF WE CHANGE VALUE OF STATIC DATA-MEMBER IN ONE OBJECT THEN IT WILL REFLECT FOR ALL OBJECTS.
        Student s2 = new Student("JEEVAN", 1108);
        System.out.println(s2.college); 
    }
}//END PUBLIC CLASS.

class Student{
    String name;
    int regNo;
    static String college = "PRESIDENCY"; //STATIC DATA-MEMBER.

    Student(String name, int regNo){
        this.name = name;
        this.regNo = regNo;
    } 
}
