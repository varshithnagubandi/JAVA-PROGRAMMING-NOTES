package loopsforwhiledowhile;

import java.util.Scanner;

public class SumofNnaturalnumbersbyforloop {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=0,i;
		System.out.println("Enter the range of n");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of "+n+" natural number is "+sum);
	}

}
