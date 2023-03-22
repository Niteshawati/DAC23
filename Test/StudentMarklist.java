
class StudentMarklist
{
	
		String Name;
		String subject;
		int Mark;
		Student()
		{
			super();
		}
		Student(String Name,String subject,int Mark)
		{
		   this.Name=Name;
		   this.subject=subject;
		   this.Mark=Mark;
		   
		}
		 void disp()
		{
			System.out.println("Name ="+Name+"Subject ="+subject+"Mark ="+Mark);
		}
	
	public static void  main(String argd[])
	{
		 Student s1 =new Student("Nikita","Marathi",78);
		 student.disp();
		 
		
	}
}
