package javaBasics;

import java.util.Iterator;

public class flowControl {

	public static void main(String[] args) {
		flowControl obj = new flowControl();
		// obj.switchStatement();
		// obj.WhileAndDoWhile();
		obj.forLoop();

	}

	public void switchStatement() {
		int x = 1 + 1;
		System.out.println(x);

		switch (x + 1) {
		case 1:
			System.out.println("this is 20");
			break;
		case 2:
			System.out.println("No valid");
			break;
		case 'a':
			System.out.println();
			break;
		default:
			System.out.println("Thsi is Default block");
		}
	}

	public void WhileAndDoWhile() {
		final int a = 10, b = 20;

		do {
			System.out.println("s");
		} while (a < b);

	}

	public void forLoop() {
		int i = 0;
		for (System.out.println(i); i < 10; i++) {

			System.out.println(i);

		}
		// ========================================================
		System.out.println("For each loop example");
		
		int[][] arr = {{1,2,3},{4,5,6}};

	
		for (int k = 0; k < arr.length; k++)
		{
			for(int j=0;j<arr[k].length;j++)
			{
				System.out.print(arr[k][j]);
			}
		}
		
		for(int[] x: arr)
		{
			for(int y:x)
			System.out.println(y);
		}
			

	  
	}
}
