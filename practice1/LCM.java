class LCM{
	public static void main(String args[]){
		int lcm;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two Number ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		lcm = num1>num2?num1:num2;
		     while(true)
			if(lcm%num1==0&&lcm%num2==0)
			{
				System.out.println("LCM OF "num1,num2,lcm);
			}
			++lcm;
		
		
		
		
	}
}