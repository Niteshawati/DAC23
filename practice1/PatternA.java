class PatternA{
	public static void main(String args[]){
		for(char ch1='A';ch1<='E';ch1++)
		{
			for(char ch2='A';ch2<=ch1;ch2++)
			{
				System.out.print(ch1);
			}
			System.out.println();
		}
	}
}