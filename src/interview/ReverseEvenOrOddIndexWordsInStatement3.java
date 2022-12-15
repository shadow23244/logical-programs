package interview;

public class ReverseEvenOrOddIndexWordsInStatement3 
{
	public static void main(String[] args) 
	{
		String s1 ="my name is xyz";
		
		String [] s2 = s1.split(" ");
		
		for(int i=0; i<=s2.length-1; i++)
		{
			String org = s2[i];
			
			if(i%2!=0)
			{
				System.out.println(findReverseOfGivenString(org));
			}
			else
			{
				System.out.println(org);
			}
			
			
		}
		
	}
	
	public static String findReverseOfGivenString(String org) 
	{
		String rev = "";
		for(int j=org.length()-1; j>=0; j--)
		{
			rev = rev + org.charAt(j);
		}
		
		return rev;
	}

}
