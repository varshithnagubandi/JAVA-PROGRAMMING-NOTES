package array;

import java.util.Scanner;

public class Takinginputfromuserfor2darray_3 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int m,n,i,j,elements;
		System.out.println("Enter the number of rows :");
		m=sc.nextInt();
		System.out.println("Enter the number of coloumns :");
		n=sc.nextInt();
		int A[][]=new int[m][n];
		elements=m*n;
		System.out.println("Enter the "+elements+" elements");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix is :");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
