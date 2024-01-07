package oops;


class parent
{
	public void m1()
	{
		System.out.println("Parent method");
	}
}



public class Is_a_Relationship_Inheritance extends parent {

	public void m2()
	{
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		parent p=new parent();
		p.m1();
		
		Is_a_Relationship_Inheritance c=new Is_a_Relationship_Inheritance();
		
		c.m1();
		c.m2();
		
		parent p1=new Is_a_Relationship_Inheritance();
		p1.m1();
		
	//	Is_a_Relationship_Inheritance c2=new parent(); compile time error, as child reference cannot be used to hold parent's object.

	}

}
