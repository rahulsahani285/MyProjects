package LogicalQuestions;

public class RevEachWordinSentence {

	public static void main(String[] args) {
		String sen="This is a Sentence";
		String[] s=sen.split(" ");

		String Rev="";
		for(String ss:s)
		{
			for(int i=ss.length()-1;i>=0;i--)
			{
				Rev=Rev+ss.charAt(i);
			}
			Rev=Rev+" ";
		}
		
	}

}
