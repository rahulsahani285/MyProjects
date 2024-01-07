package LogicalQuestions;

public class Palindrome {

	public static void str(String s) {
		char[] a = s.toCharArray();
		char[] ch = new char[s.length()];
		int i = a.length - 1;

		for (int j = 0; j < a.length; j++) {
			ch[i] = a[j];
			i--;
		}

		if (String.valueOf(ch).equals(String.valueOf(a))) {
			System.out.println("Given String is palindrome");
		} else if (!String.valueOf(ch).equals(String.valueOf(a))) {
			System.out.println("Not palindrome");
		}
	}

	public static void str2(String s) {
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + ( s.charAt(i));
		}

		if (s.equals(rev)) {
			System.out.println("Given string is palindrome");
		} else if (!s.equals(rev)) {
			System.out.println("Given string is not a palindrome");
		}
	}

	public static void num(int i) {
		int rev = 0;
		while (i != 0)
		{
			rev=rev*10 + i%10;
			i=i/10;
			
		}
		System.out.println(rev);
		
	}

	public static void main(String[] args) {
		// str("sababas");
		//str2("aba");
		num(12321);
	}
}
