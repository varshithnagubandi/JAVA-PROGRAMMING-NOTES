package loopsforwhiledowhile;

import java.util.Scanner;

public class SumofPOSITIVENUMBERSwhileloop {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner (System.in);
		int sum=0,num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		while(num>=0)
		{
			sum=sum+num;
			System.out.println("Enter the number");
			num=sc.nextInt();
			
		}
		System.out.println("Sum of positive numbers is"+sum);
		
	}

}
