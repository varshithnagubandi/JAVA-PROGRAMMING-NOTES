package conditionalstatements;

import java.util.Scanner;

public class Nestedifelse5 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		if(a>50)
		{
			System.out.println("Given number is greater than 50");
			if(a>75)
			{
				System.out.println("Given number is greater than 75");
			}
		}
		else
		{
			System.out.println("Please enter the number greater than 50 to get any output");
			
		}
	}

}
