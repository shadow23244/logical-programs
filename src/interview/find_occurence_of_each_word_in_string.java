package interview;

import java.util.HashMap;

public class find_occurence_of_each_word_in_string
{
	public static void main(String[] args) 
	{
		String a= "hello hello my name is is rahul";
		
		HashMap<String, Integer> hm=new HashMap<>();
		
		String[] a1 = a.split(" ");
		for(int i=0; i<=a1.length-1; i++)
		{
			String a2 = a1[i];
			
			if(hm.containsKey(a2))
			{
				hm.put(a2, hm.get(a2)+1);
			}
			else
			{
				hm.put(a2, 1);
			}
		}
		
		System.out.println(hm);
	}

}
