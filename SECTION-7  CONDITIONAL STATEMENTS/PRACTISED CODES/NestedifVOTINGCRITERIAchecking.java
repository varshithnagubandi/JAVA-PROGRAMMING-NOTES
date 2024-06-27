package conditionalstatements;

import java.util.Scanner;

public class NestedifVOTINGCRITERIAchecking {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("PLEASE ENTER YOUR BORN COUNTRY IN CAPITALS LETTERS");
		String str1=sc.nextLine();
		System.out.println("PLEASE ENTER YOUR AGE");
		int a=sc.nextInt();
		String str2="INDIA";
		if(str1.equals(str2))
		
		{
			if(a>=18)
			{
				System.out.println("HURRY!! YOU CAN VOTE");
			}
			else
			{
				System.out.println("YOU ARE ELIGIBLE TO VOTE IN INDIA");
			}
		
	}
		else
		{
			System.out.println("YOU ARE ELIGIBLE TO VOTE IN INDIA");
		}
	}

}
