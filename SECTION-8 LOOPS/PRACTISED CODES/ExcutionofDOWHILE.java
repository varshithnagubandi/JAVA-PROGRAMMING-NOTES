package loopsforwhiledowhile;

import java.util.Scanner;

public class ExcutionofDOWHILE {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
	}

}
