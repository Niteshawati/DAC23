import java.util.Scanner;
class SumofDigit{
	public static void main(String args[]){
		int digit;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		while(num>0)
		{
			digit = num%10;
			
			sum = sum + digit;
			
			num = num/10;
			
			
		}
		System.out.println("Sum of Digit "+sum);
	}
}