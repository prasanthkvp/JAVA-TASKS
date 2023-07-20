import java.util.Scanner;
class Stateif{
public static void main(String args[]){
 Scanner obj = new Scanner(System.in);
System.out.println("enter your mark");
 int mark = obj.nextInt();
if((mark >=0)&&(mark <=39)){
System.out.println("Grade=D");
}
else if((mark>=40)&&(mark<=59)){
System.out.println("Grade=c");
}
else if(mark <=79){
System.out.println("Grade=b");
}
else if(mark <=89){
System.out.println("Grade=a");
}
else if(mark <=100){
System.out.println("Grade=o");
}


}
}             	
  
 