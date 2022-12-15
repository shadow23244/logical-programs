package interview;

import java.util.Scanner;

public class palindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a word : ");
		String s1 = scan.next();
		
		String s2= "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2= s2+ s1.charAt(i);
		}
		System.out.println(s2);
		
		if(s1.equals(s2))
		{
			System.out.println("s1 is palindrome");
		}
		else
		{
			System.out.println("s1 is not palindrome");
		}
		
	}

}
