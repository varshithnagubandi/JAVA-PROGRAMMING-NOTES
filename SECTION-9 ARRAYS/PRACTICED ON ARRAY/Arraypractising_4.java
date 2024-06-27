package array;

import java.util.Scanner;

public class Arraypractising_4 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner (System.in);
		int A[]= {1,2,3,4,5,6};
		int i;
		System.out.println("LENGTH OF ARRAY"+A.length);
		System.out.println(A[0]);
		A[0]=15;
		for(i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
		
	}

}
