package interview;

public class to_find_uppercase_lowercase_letters 
{
	public static void main(String[] args) 
	{

		String s1 = "My name Is Kamlesh";
		
		int upper = 0;
		int lower = 0;
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			char a= s1.charAt(i);
			if(a>=65 && a<=90)
			{
				upper++;
			}
			else
			{
				lower++;
			}
		}
		
		System.out.println(upper);
		System.out.println(lower);
		
	}
		
	

}
