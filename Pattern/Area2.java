class Area2
{
	float r=5;
	float s=12;
	float h=12;
    float b=10;
	
	
	void cal_circle()
   {
	   System.out.println("area of circle = "+(3.14*r*r));
   }
   
   void cal_tri()
   {
	   System.out.println("area of Triangle = "+(0.5*b*h));
   }
   void cal_Squ()
   {
	   System.out.println("area of square = "+(s*s));
   }
   void cal_react()
   {
	   System.out.println("area of reactangle = "+(h*b));
   }
	
	public static void main(String args[])
	{
		System.out.println("Area");
		Area c1=new Area();
		c1.cal_circle();
		c1.cal_tri();
		c1.cal_Squ();
		c1.cal_react();
		
	
		
	}
	
	
	
	
	
}