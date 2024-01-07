/*Points to be noted:
1. The Constructor call such as this() and super() must be the first statement in a constructor
*/
class first {

	 first()
	 {
		 System.out.println("Parent class constructor");
	 }
	 first(int a)
	 {
		 this();
		 System.out.println(a);
	 }

}
 
class second extends first
{
	private int j;
	second(int j)
	{
		this();
		this.j=j;
		System.out.println("Second class constructor and "+j);
		
	}
	public second() {
		super(60);
		System.out.println("This is a child class constructor with NO arguments ");
	}
}



public class Constructor_Chaining {

	public static void main(String[] args) {

		new second(20);

	}
}
