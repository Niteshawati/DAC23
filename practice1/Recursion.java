import java.util.Scanner;
class Recursion{
	static int Factorial(int n)
	{
		if(num==0)
		{
			return 1;
		}
		else
		{
			return(num*Factorial(num-1));
		}
	}
	public static void main(String args[]){
		int fact = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		
		fact = factorial(number);
		System.out.println("Factorial of "+num+" is "+fact);
		
	}
}