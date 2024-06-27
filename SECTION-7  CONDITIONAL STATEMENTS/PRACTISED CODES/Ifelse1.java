package conditionalstatements;

import java.util.Scanner;

public class Ifelse1 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number");
		
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("It is an positive NUMBER");
		}
		else
		{
			System.out.println("It is an negative NUMBER");
		}
		
		
	}

}
