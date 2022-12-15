package interview;

public class reverseno_usingString 
{
	public static void main(String[] args) 
	{
		int num = 4561;
		
		String org = Integer.toString(num);
		
		String rev = "";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev = rev + org.charAt(i);
		}
		
		
		int revnum = Integer.parseInt(rev);
		System.out.println(revnum);
		
	}

}
