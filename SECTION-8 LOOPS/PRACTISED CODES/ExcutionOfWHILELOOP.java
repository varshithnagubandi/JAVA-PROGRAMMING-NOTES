package loopsforwhiledowhile;

import java.util.Scanner;

public class ExcutionOfWHILELOOP {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n,factorial=1,temp;
		System.out.println("Enter the number to know the factorial of that number :");
		n=sc.nextInt();
		temp=n;
		while(n!=0)
		{
			factorial=factorial*n;
			n=n-1;
		}
		System.out.println("value of "+temp+"! is "+factorial);
		
	}

}
