import java.util.Scanner;
class AddNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int num3 = Add(num1,num2);
		System.out.println("Addition of two Number is "+num3);
	}
}