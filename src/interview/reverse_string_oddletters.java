package interview;

public class reverse_string_oddletters
{
	public static void main(String[] args) 
	{
String s1 = "my name is kamlesh";
		
		String [] a = s1.split(" ");
		
		for(int i=0; i<=a.length-1; i++)
		{
			String rev = "";
			String s2 = a[i];
			if(i%2==0)
			{
				
				
				for(int j=s2.length()-1; j>=0; j--)
				{
					rev = rev + s2.charAt(j);			
				}
			}
			else
			{
				rev = rev + s2;
			}
			System.out.print(rev+" ");
		}
		
		
	}

}
