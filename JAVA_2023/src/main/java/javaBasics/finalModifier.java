package javaBasics;


//NOTE: Every method present inside final class is always final ,, but every variable presetn inside final class need not be final.
/*final */ public class finalModifier {

	public static void main(String[] args) {
		child obj = new child();
		obj.property();
		obj.marry();

		finalModifier obj2 = new finalModifier();
		obj2.property();
		obj2.marry();

	}

	void property() {
		System.out.println("cash and gold");
	}

	/* final */ void marry() {
		System.out.println("subhalaxmi");
	}

}

class child extends finalModifier {
	public void property() {
		System.out.println("Only cash");
	}

	void marry() {
		System.out.println("Vaishnavee");
	}

}
