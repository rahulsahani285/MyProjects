import java.util.HashMap;
import java.util.Map;

public class CaharacterOccurance {
	
	
	public static void charoccurance(String s, String ch)
	{
		
		
		int length=s.length();
		
		int length2=s.replace(ch,"").length();
		System.out.println(length+" "+length2);
		System.out.println("The occurance of letter "+ch+" is: "+""+(length-length2));
		
	}
	
	public static void charoccuranceusingMap(String s)
	{
		char[] chr=s.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c:chr)
		{
			
			if(!String.valueOf(c).isBlank())
			{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
			}
			
		}
		
		System.out.println(map);
		//System.out.println(String.valueOf(chr));
	}

	public static void main(String[] args) {
		
		//charoccurance("This is Rahul Nishad to check character occurance", "r");
		charoccuranceusingMap("This is Rahul Nishad to check character occurance");
		charoccuranceusingMap("RRR rrrr RRR rrr 123");

	}

}
