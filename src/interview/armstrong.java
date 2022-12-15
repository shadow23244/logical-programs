package interview;

public class armstrong 
{
	public static void main(String[] args) 
	{
		int num =234;
		
		int sum = 0;
		
		for(int i=num; i>=1; i=i/10)
		{
			int rem = i%10;
			sum = sum + (rem*rem*rem);
		}
		if(sum==num)
		{
			System.out.println("num is an armstrong number"); 
		}
		else
		{
			System.out.println("num is not an armstrong number");
		}
		
	}

}
