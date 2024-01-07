package LogicalQuestions;
public class CountWordsinString {
	
	
	public static void countwords(String s)
	{
		String[] arr=s.split(" ");
		System.out.println(arr.length);
	}
	
	public static void countcharacters(String s)
	{
		String[] arr=s.split("");
		char[] ch= s.toCharArray();
		System.out.println(arr.length);
		System.out.println(s.charAt(1));
		
	}
	

	public static void main(String[] args) {
		countwords("Count the words in this string sentence");
		countcharacters("Count the words in this string sentence");

	}

}
