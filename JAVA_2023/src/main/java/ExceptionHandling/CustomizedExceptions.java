package ExceptionHandling;

import java.util.Scanner;

class AgeGreater extends RuntimeException // We should extend only unchecked Exception
{
	AgeGreater(String s)
	{
		super(s);
	}
}

class AgeSmaller extends RuntimeException  
{
	AgeSmaller(String s)
	{
		super(s);
	}
}

public class CustomizedExceptions {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int i=sc.nextInt();
		
		if(i<18)
		{
			throw new AgeGreater("Your Age is greter than the required age");
		}
		else if(i>60)
		{
			throw new AgeSmaller("Your Age is Smaller than the required age");

		}

	}

}
