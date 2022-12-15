package interview;

public class reverse_string_usingsplit 
{
	public static void main(String[] args) 
	{
		String s1 ="my name is kamlesh";
		
		String [] s2 = s1.split(" ");
		
		System.out.println(s2[1]);
		
		
		System.out.println("--------------------");
		
		for(int i=s2.length-1; i>=0; i--)
		{
			System.out.print(s2[i]+" ");
		}
		
	}

}
