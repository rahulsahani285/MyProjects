package oops;

class derived
{
	static int a=10;
	static {
		System.out.println("This is a 1st static block on parent class");
		m2();
	}
	public static void m2(){
		System.out.println("Method m2");
		System.out.print(b);
	}
	
	static String b="this is a static variable b";
	
}


public class StatiControlFlow extends derived {
	
	static int i=10;
	
	static
	{
		System.out.println(i);
		m1();
		System.out.println("1st Static block");
		
	}

	public static void main(String[] args) {
		m1();
		System.out.println("This is Main method");
	}
	public static void m1()
	{
		System.out.println(j +" This is m1 method");
	}
	static
	{
		System.out.println("2nd Static block");
	}
	static int j=20;

}
