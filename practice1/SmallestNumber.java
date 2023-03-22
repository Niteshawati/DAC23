import java.util.Scanner;
class SmallestNumber{
   public static void main(String args[]){
        int num;
		int smallest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 number :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int temp = num1<num2?num1:num2;
		 smallest = temp<num3?temp:num3;
		
		System.out.println("Smallest number ="+smallest);
		
   }	   
}
