import java.util.Scanner;
class voter{
	public static void main(String args[]){
		System.out.println("Eligibility  Of voter : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age=sc.nextInt();
		System.out.println("Enter your Adhar number :");
		int number=sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are Eligible For voting");
		}
		else
		{
			System.out.println("You are not Eligible");
		}
		
		
	}
	
}