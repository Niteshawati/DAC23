import java.util.Scanner;
class Switch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String c = "";
		
		switch(a)
		{
			case 1 : c = "v";
			break;
			case 2 : c = "S";
			
			System.out.println(c);
		}
	}
	
}