package LogicalQuestions;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=3347;
		
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
			System.out.println("Prime number");
		else if(count!=2)
		{
			System.out.println("Not Prime number");
		}

	}

}
