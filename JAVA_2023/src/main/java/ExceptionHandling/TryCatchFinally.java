package ExceptionHandling;

public class TryCatchFinally {

	static
	{
		System.out.println("This is static block");
	}
	
	
	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException rahul)
		{
			System.out.println("Exception caught");
		}
		catch(Exception e)
		{
			System.out.println("this is exeption"+ 10/2);
		}
		
		
		finally
		{
			System.out.println("this is finally block");
		}
		System.out.println("This is after try block");
		TryCatchFinally obj = new TryCatchFinally();

	}
	
	

}
