public class CopyConstructure {
    
    public static void main(String[] args) {
        int marks[] = {98,99,98};
        Student s1 = new Student("SOHAIL",marks);

        Student s2= new Student(s1);

        //IF WE MODIFY (ARRAY)DATA-MEMBERS OF OLD OBJECT AFTER INITIALIZING NEW OBJECT WITH OLD OBJECT. THAT WILL REFLECT IN NEW OBJECT ALSO. BECAUSE ARRAYS ARE PASSED BY REFRENCE.
        s1.marks[0] = 99;
        s1.marks[1] = 100;
        s1.marks[2] = 99;

         //MARKS OF OBJECT2 THAT IS S2.
        for(int var : s2.marks){
            System.out.println(var);
        }
        
    }//end main function.
}//end public class.

class Student{
    String name;
    int marks[] = new int[3]; //phy chem math

    Student(String name,int array[]){
        this.name = name;
        this.marks = array;
    }
    //COPY-CONSTRUCTURE.
    Student(Student s){
        this.name = s.name;
        this.marks = s.marks; //arrays are passed by reference.
    }
}
