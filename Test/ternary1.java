import java.util.Scanner;
class ternary1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the First number :");
		int num2 = sc.nextInt();
		
		int num3 = (num1>num2)?(num1+num2):(num1-num2);
		System.out.println("Num3 = "+num3);
		
		
	}
	
}