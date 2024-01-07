package interfaces;

interface durga
{
	 default void m1()
	 {
		 
	 }

	void m2();
}

abstract class ServiceProvider implements durga
{
	public void m1()
	{
		
	}

	
}

class subServiceProvider extends ServiceProvider
{
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}


public class javaInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
