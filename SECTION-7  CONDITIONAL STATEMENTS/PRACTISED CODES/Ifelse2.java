package conditionalstatements;

import java.util.Scanner;

public class Ifelse2 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		if(a<1000) {
			System.out.println("Given number is less than 1000");
			
		}
		else
		{
			System.out.println("Given number is greater than than 1000");
			
		}
	}

}
