package loopsforwhiledowhile;

import java.util.Scanner;

public class Loopmultiplication {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for the multiplicaion :");
		int i,n,mul;
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			mul=n*i;
			System.out.println(n+" x "+i+"="+mul);
		}
	}

}
