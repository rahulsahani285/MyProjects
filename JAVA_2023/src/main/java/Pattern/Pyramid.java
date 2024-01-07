package Pattern;

public class Pyramid {

	public static void main(String[] args) {

		for (int i = 10; i > 0; i--) 
		{

			for (int j = 0; j < i; j++) 
			{
				System.out.print(" ");

			}
			for (int k = 10; k >= i; k--) 
			{
				if(k%2==0)
				{
				System.out.print(k);
				}
				else
				{
					System.out.print("* ");
				}
			}

			System.out.println();
		}

	}

}
