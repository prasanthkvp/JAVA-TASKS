import java.util.Scanner;
class Ifstate{
 		public static void main(String args[]){
   		Scanner obj = new Scanner(System.in);
  		System.out.println("enter your age");
    		int age = obj.nextInt(); 
 	//int age = 25;
 	if(age<25){
		System.out.println("Not allowed");
	          }
	else{
     		System.out.println("Allowed");
	    }
}
} 
