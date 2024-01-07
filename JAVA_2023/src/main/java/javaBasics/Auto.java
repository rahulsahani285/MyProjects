package javaBasics;

abstract class abstractmodifier {
	int roll;
	String name;

	abstract public int numberofwheels();

	abstract public int milage();

	// final method is allowed in abstract class but not vise versa
	final int a = 10;

	final public void add() {

	}

}

abstract class car extends abstractmodifier {
	car(int a, String b)
	{
		this.roll=a;
		this.name=b;
		System.out.println(a+" "+b);
	}
	public int numberofwheels() {
		return 4;
	}

}

class last extends car
{
	last(int a, String b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int milage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Auto extends abstractmodifier {

	public int numberofwheels() {
		return 3;
	}

	public int milage() {
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("this is main methd");
		
		last obj1=new last(12,"rahul nishad");
		last obj2= new last(13,"Ankit singh");
		

	}
}
