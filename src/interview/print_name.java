package interview;

public class print_name 
{
	public static void main(String[] args) 
	{
		String input ="Husharwasim";
		
		String output = "";
		
		for(int i=0; i<=input.length()-1; i++)
		{
			
			output = output+ input.charAt(i);
			System.out.println(output);
			
		}
		
		
		
	}

}
