package oops;

class parent1 {
	public void m1() {
		System.out.println("Parent method");
	}

}

public class Overriding extends parent1 {

	public void m1() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		parent1 obj = new Overriding();
		obj.m1();
	}
}
