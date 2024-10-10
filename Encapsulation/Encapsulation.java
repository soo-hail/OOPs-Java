//ENCAPSUTION : IS A WAY TO ACHIVE DATA HIDING. BY MAKING ALL DATA MEMBERS OF A CLASS AS PRIVATE AND THEY CAN BE ASSECED ONLY BY GETTERS AND SETTERS
import java.util.Scanner;
public class Encapsulation {
    public static void main(String[] args) {
        
        bankAccount ba = new bankAccount();
        ba.createAccount();
        ba.accountInfo();

        ba.setPassword();

        ba.accountInfo();

        ba.getPassWord();

    }//END MAIN FUNCTION.
}//END PUBLIC CLASS.

//ENCAPSULE CLASS : ALL DATA-MEMBERS ARE PRIVATE.
class bankAccount{ //default class
    private String name; 
    private int accNO ; 
    private long mobNO;
    private int password;
   
    Scanner sc = new Scanner(System.in);

    //CREATE ACCOUNT.
    void createAccount(){ 
        System.out.println("CREATE ACCOUNT");
        System.out.println("ENTER NAME : ");
        name= sc.nextLine();
        System.out.println("ENTER MOBILE NUMBER : ");
        mobNO = sc.nextInt();
        System.out.println("SET PASSWORD : ");
        password = sc.nextInt();
        //ACCOUNT NUMBER.
        accNO = (int)name.charAt(0) + (int)name.charAt(1) + (int)name.charAt(2);
    } 

    //ACCOUNT INFORMATION.
    void accountInfo(){
        System.out.println();
        System.out.println("ACCOUNT DETAILS : ");
        System.out.println("NAME : " + name);
        System.out.println("MOBILE : " + mobNO);
        System.out.println("ACCOUNT NO : " + accNO);
    }

    void setPassword(){
        System.out.println();
        System.out.println("ENTER OLD PASSWORD :");
        int op = sc.nextInt();
        if(op == password){
            System.out.println("ENTER NEW PASSWORD : ");
            password = sc.nextInt();
            System.out.println("PASSWORD SUCESSFULLY CHANGED");
        }else{
            System.out.println("WRONG PASSWORD!!");
        }
        
    }

    void getPassWord(){
        System.out.println();
        System.out.println("PASSOWRD INFO");
        System.out.println("ENTER ACCOUNT NO : ");
        int acc= sc.nextInt();
        System.out.println("ENTER MOBILE NUMBER : ");
        int mb = sc.nextInt();

        if(accNO == acc && mobNO == mb){
            System.out.println("PASSWORD : " + password);
        }else{
            System.out.println("WRONG ACCOUNT NUMBER OR PASSWORD");
        }
    }
}
