import java.util.Scanner;
class GCD{
	public static void main(String args[]){
		int GCD = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x and y ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for( int i=1;i<=x&&i<=y;i++)
		{
			if(x%i==0&&y%i==0);
			{
				GCD = i;
			}
			System.out.println(" GCD of x and y "+GCD);
		}
	}
}