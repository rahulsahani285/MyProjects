package com.Selenium.Basics;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class stringcheck {

	public static void ReverseString() {
		String s = "12,55,22,6,8,66,44";

		String[] str = s.split(",");
		for (String string : str) {
			int i = Integer.parseInt(string);
			if (i % 2 == 0) {
				System.out.println(i + " " + " the number is even");
			} else if (i % 2 != 0) {
				System.out.println(i + " " + "the number is odd");
			}
		}
	}

	public static void ReversewordsinString() {
		String s = "Rahul INDIAN";
		String OutputString="";

		String[] str = s.split(" ");
		
		int length=str.length;
		
		for (int i=0;i<length;i++) {
			 String [] fs=str[i].split("");
			 for(int j=str[i].length()-1;j>=0;j--)
			 {
				 
			 OutputString=OutputString+fs[j];

			 }
			 OutputString=OutputString+" ";
		}
		System.out.println(OutputString);
	}

	public static void main(String[] args) {
		ReversewordsinString();
	}

}
