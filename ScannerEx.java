import java.util.Scanner;

class ScannerEx{
public static void main(String args[]){

    Scanner obj = new Scanner(System.in);
   System.out.println("Tell the first name:");
   String firstname = obj.nextLine();
   System.out.println("Your first name is :" + firstname);

   System.out.println("tell your age:");
   int age = obj.nextInt();
   obj.nextLine();
   System.out.println("age is :" + age);


    System.out.println("Enter your password");
   String pass = obj.nextLine();
   System.out.println("Your password is :" + pass);
    
  


}
}


 