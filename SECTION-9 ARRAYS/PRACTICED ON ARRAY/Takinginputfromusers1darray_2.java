package array;

import java.util.Scanner;

public class Takinginputfromusers1darray_2 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int A[]=new int[1000];
		int i,n;
		System.out.println("Enter the number of elements you wanted to enter");
		n=sc.nextInt();
		System.out.println("Enter the "+n+" Elements :");
		for(i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("Elements in the array are : ");
		for(i=0;i<n;i++)
		{
			System.out.println(A[i]+" ");
		}
		
		
		
	}

}
