import java.util.Scanner;
class SwitchEx{
public static void main(String args[]){
Scanner obj = new Scanner(System.in);
System.out.println("Enter the number 1 t0 5");
int number = obj.nextInt();

switch(number){
case 1:
System.out.println("sun");
break;
case 2:
System.out.println("mon");
break;
case 3:
System.out.println("tue");
break;
case 4:
System.out.println("wed");
break;
case 5:
System.out.println("thus");
break;
default:
System.out.println("sry");
}
}
}