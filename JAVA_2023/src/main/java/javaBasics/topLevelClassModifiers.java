package javaBasics;

/* 
 * 
 * For Top level classes only 5 modifiers are allowed
- public
- <default>
- final
- abstract
- strictfp 

For Inner classes:
- public
- <default>
- final
- abstract
- strictfp 
- private
- protected
- Static

*/

public class topLevelClassModifiers {

	public topLevelClassModifiers(int a) {
		this();
		System.out.println("this is integer parent class constructor ");
	}
	public topLevelClassModifiers() {

		System.out.println("this is parent class constructor ");
	}
	protected  void display() {
		
		System.out.println("This is protected parent class print statement");
	}
	public static void main(String[] args) {
		
		System.out.println("This is Class 'topLevelClassModifiers' from package 'javaBasics' ");
	}

}

class second extends topLevelClassModifiers {
	public  void display() {
		System.out.println("This is child class print statement");
	}

}
