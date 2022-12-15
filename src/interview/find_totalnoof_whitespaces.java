package interview;

public class find_totalnoof_whitespaces 
{
	
	public static void main(String[] args) 
	{
		String s1 = "a b  c d";
		
		int count= 0;
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			char str = s1.charAt(i);
			if(str == ' ')
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		System.out.println(s1.replace(" ", ""));
		
		
	}

}
