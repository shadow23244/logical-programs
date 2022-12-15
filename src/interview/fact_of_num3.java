package interview;

public class fact_of_num3
{
	public static void main(String[] args) 
	{
		int fact = 1 ;
		int num = 4;
		
		for(int i=num; i>=1; i--)
		{
			fact = fact * i;
		}
		System.out.println(fact);
		
	}

}
