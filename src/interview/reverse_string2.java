package interview;

public class reverse_string2
{
	public static void main(String[] args) 
	{
		String s1 = "my name is kamlesh";
		String rev = "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);
		
	}

}
