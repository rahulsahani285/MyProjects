package LogicalQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesinArray {

	//Using Set and list to know the duplicate values
	public static void findduplicates(int... arr) {
		Set<Integer> duplicates=new HashSet<Integer>(); // Used this to doesnt allow duplicate v
		List<Integer> l=new ArrayList<>();
		for(int i: arr)
		{
			if(duplicates.contains(i))
			{
				System.out.println(i+" is already present");
				l.add(i);
			}
			duplicates.add(i);
		}
		for(int a:l)
		{
			System.out.println(a);
		}
		
		
		
	}

	
	
// To get the number of times the integer is repeated
	public static void findCountOfDuplicates(int ...arr)
	{
		List<Integer> lst=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i;j<arr.length;j++)
			{
				if(lst.contains(arr[i]))
				{
					continue;
				}
				else if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			
			if(!lst.contains(arr[i]))
			System.out.println(arr[i]+" is repeated "+count+" times");
			
			lst.add(arr[i]);
		}
	}
	
	

	public static void main(String[] args) {
		//findduplicates(1,2,6,9,5,9,1,5);
		findCountOfDuplicates(1,1,2,3,4,5,3,4,5,3,4,5,1);
	}

}
