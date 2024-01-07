package javaBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class TwomainClass {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		ArrayList<String> arl=new ArrayList<String>();
		
		arl.add(str);
		
		for(String s:arl)
		System.out.println(s);
		
	}

}
