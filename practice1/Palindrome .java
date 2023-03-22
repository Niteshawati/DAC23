class Palindrome{
	public static void main(String args[]){
		int reminder;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two number :");
		int num1=sc.nextInt();
		
		int temp = sum;
		while(num1>0)
		{
			reminder = num1%10;
			sum = sum*10+reminder;
			num2 = num1/10;
		}
		if(temp==sum)
		{
			System.out.println(" Palindrom Number ");
		}
		else
		{
			System.out.println(" not polindrom ");
		}
	}
}