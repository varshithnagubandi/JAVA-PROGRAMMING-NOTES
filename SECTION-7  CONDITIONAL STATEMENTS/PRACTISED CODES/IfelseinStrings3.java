package conditionalstatements;

import java.util.Scanner;

public class IfelseinStrings3 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1");
		String str1=sc.nextLine();
		System.out.println("Enter the String 2");
		String str2=sc.nextLine();
		if(str1.equals(str2))
		{
			System.out.println("BOTH THE STRINGS ENTERED ARE SAME");
		}
		else
		{
			System.out.println("BOTH THE STRINGS ENTERED ARE NOT SAME");
		}
		
	}

}
