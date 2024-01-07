package LogicalQuestions;


public class CountNumberOfDigits {
	
	
	public static void count(int i )
	{
		int count=0;
		
		while(i>0)
		{
			count++;
		i=i/10;
		
		}
		System.out.println(count);
	}
	
	public static void sum(int i)
	{
		int sum=0;
		
		while(i>0)
		{
		sum=sum+i%10;
		i=i/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		count(1343377);
		sum(345678);

	}

}
