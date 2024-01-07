package oops;

public class SingletonClass {
	
	private static SingletonClass variable=new SingletonClass();
	
	
	private SingletonClass()
	{
		
	}
	
	public static SingletonClass getText()
	{
		return variable;
	}

}

class second
{
	SingletonClass obj=SingletonClass.getText(); // Calling SingletonClass's method using its object
	
}
