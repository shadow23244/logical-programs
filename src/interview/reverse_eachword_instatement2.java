package interview;



public class reverse_eachword_instatement2
{
	public static void main(String[] args) 
	{
		String s1 = "my name is abc";
		
		String [] s2 = s1.split(" ");
		
		
		for(int i=0; i<=s2.length-1; i++)
		{
			String org = s2[i];
			
			System.out.println(findReverseOfGivenString(org));
		}
		
	  
		
	}
	
	public static String findReverseOfGivenString(String org) 
	{
		String rev ="";
		for(int j=org.length()-1; j>=0; j--)
		{
			rev = rev + org.charAt(j);
		}
		return rev;
		
	}

}
