import java.util.Scanner;
class Indefier{
	public static void main(String args[]){
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter   number :");
		int num1=sc.nextInt();
		System.out.println("Enter  number :");
		int num2=sc.nextInt();
		System.out.println("Enter  number :");
		int num3=sc.nextInt();
		int max = num1>num2 ? (num1>num2 : num1 : num3) : (num2>num3 ? num2 : num3);
		System.out.println("Max = "+max);
		
		
		
		
	}
	
	
}