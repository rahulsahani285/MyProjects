package javaBasics;

public class MultipleClasses {

	public static void main(String[] args) {
		System.out.println("Multiple classes");

	}

}

class A {
	public static void main(String args[]) {
		System.out.println("Class a");
	}

} 

class B extends A {
	public static void main(String args[]) {
		System.out.println("Class b");
	}
}

class c {

}