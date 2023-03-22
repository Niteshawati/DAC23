import java.util.Scanner;
class Digit{
	public static void main(String args[]){
		int num,digit, num2,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num1 = sc.nextInt();
		
	    while(num>0)  
		{
			digit = num%10;
			System.out.println("Digit at place "+counter" is "+digit);
			
			num = num/10;
			
			counter++
		}
		
		
	}
	
}