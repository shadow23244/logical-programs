package interview;

public class anagrams 
{
	public static void main(String[] args) 
	{
		String a= "omicron";
		String a3= "moronic";
		String a2= "";
		
		for(int i=0; i<=a.length()-1; i++)
		{
			char c = a.charAt(i);
			
			for(int j=a3.length()-1; j>=0; j--)
			{
				char d = a.charAt(j);
				if(c==d)
				{
					a2=a2+d;
					break;
				}
			}
			
			
		}
		
		
		if(a.equalsIgnoreCase(a2))
		{
			System.out.println(a +" is an anagram");
		}
		else
		{
			System.out.println(a +" is not an anagram");
		}
		
	}

}
