package interview;

import java.util.Scanner;

public class prime_num 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number : ");
		int n = scan.nextInt();
		int count = 0;
		for(int i=2; i<=n-1; i++)
		{
			if(n%i==0)
			{
				count++;
				break;
				
			}
		}
		if(count==1)
		{
			System.out.println(n+" is not prime");
		}
		else
		{
		   System.out.println(n+" is prime");
		}
		
		
	}

}
