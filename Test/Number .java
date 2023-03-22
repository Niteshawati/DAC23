import java.util.Scanner;
class Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num1=sc.nextInt();
		
		if(num1%2)
		{
		    System.out.println("number is Even");	
		}
		else
		{
		   System.out.println("Number is Odd ");
		}
		
		
	}
	
}