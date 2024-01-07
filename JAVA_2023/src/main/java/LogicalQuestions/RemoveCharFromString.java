package LogicalQuestions;

public class RemoveCharFromString {

	public static void main(String[] args) {
		String s="RahulNishad";
		String vowels="aeiouAEIOU";
		String res="";
		//Remove vowels from string
		for(char ch:s.toCharArray())
		{
			
			if(vowels.indexOf(ch)==-1)
			{				res=res+ch;
			
			}
		}
		
		System.out.println(res);

	}

}
