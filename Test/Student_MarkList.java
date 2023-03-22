import java.util.Scanner;
class Student_MarkList{
    public static void main(String args[])
	{
        float eng,mar,maths,hist,hindhi;
		double total,avg,per;
		
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter marks of english subject :");
		eng=sc.nextInt();
		System.out.print("Enter marks of marathi :");
		mar=sc.nextInt();
		System.out.print("Enter marks of maths :");
		maths=sc.nextInt();
		System.out.print("Enter the marks of hist");
		hist=sc.nextInt();
		System.out.print("Enter the marks of hindhi :");
		hindhi=sc.nextInt();
		
		total=eng+mar+maths+hist+hindhi;
		avg=(total/5.0);
		per=(total/500.0)*100;
		System.out.println("Total Marks ="+total);
		System.out.println("avg ="+avg);
		System.out.println("Per ="+per);
	}	
}
