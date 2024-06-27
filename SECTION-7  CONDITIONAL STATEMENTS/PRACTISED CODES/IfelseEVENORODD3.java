package conditionalstatements;

import java.util.Scanner;

public class IfelseEVENORODD3 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Entered number is even number");
		}
		else
		{
			System.out.println("Entered number is odd number");
		}
	}

}
