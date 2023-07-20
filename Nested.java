import java.util.Scanner;

class Nested{

	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = obj.nextInt();
		if (age>=18){
			System.out.println("success");
			System.out.println("enter you percentage");
			int percentage = obj.nextInt();

				if (percentage >60){
					System.out.println("success");
				}else{
					System.out.println("fail");
				}	

		}else{
			System.out.println("fail");
		}
	}
}

