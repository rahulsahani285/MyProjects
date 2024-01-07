package oops;

class hiding
{
	private int a=100; // Data hiding
	
	public int get()
	{
		return a;
	}
	
}

public class dataHiding extends hiding {

	
	public static void main(String[] args) {
		
dataHiding obj=new dataHiding();
System.out.println(obj.get());
	}

}
