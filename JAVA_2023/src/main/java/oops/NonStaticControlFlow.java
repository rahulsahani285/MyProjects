package oops;

class first{
	int a=10;
	{
		m1();
		System.out.println("This is instance block");
		System.out.println(a);
	}
	
	first()
	{
		System.out.println("Parent Constructor");
	}
	public static void main(String args[])
	{
		first obj=new first();
		System.out.println("Parent main");
	}
	
	public void m1()
	{
		System.out.println(j);
	}
	int j=20;
	
}

public class NonStaticControlFlow extends first{
	
	int x=100;
	
	{
		m2();
		System.out.println("Child not static block");
	}
	
	NonStaticControlFlow()
	{
		System.out.println("This is child's constrution");
	}
	public void m2()
	{
		 System.out.println("y");
	}

	public static void main(String[] args) {
		System.out.println("This is child main class");
		NonStaticControlFlow obj2=new NonStaticControlFlow();

	}
	{
		System.out.println("2nd non static block of child class");
	}
	int y=200;

}
