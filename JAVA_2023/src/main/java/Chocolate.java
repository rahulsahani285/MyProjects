
/*
 Problem statement: You have 15 rupees.  Each chocolate costs 1 rupee. when you return 3 wrappers of chocolate back to the shopkeeper, 
he'll give you 1 chocolate.  
Q] HOW MANY CHOCOLATED YOU CAN HAVE IF YOU HAVE 15 RUPEES. */

public class Chocolate {
	static int wrapper;

	public static int Choco(int rupees) {

		for (int i = 1; i <= rupees; i++) {
			wrapper++;

			if (wrapper == 3) {
				rupees++;
				wrapper = 0;
			}
		}
		return rupees;
	}

	public static void main(String[] args) {
		System.out.println(Choco(27));
 
	}

}
