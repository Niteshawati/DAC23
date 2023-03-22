class MinMax{
	public static void main(String[] arg)
	{
		int arr[]={10, 56, 43, 78, 58, 54};
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("Min value in array is: "+min);
		System.out.println("Max value in array is: "+max);
		
       		
	}
}