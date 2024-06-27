package array;

import java.util.Scanner;

public class Sumofelementsinarray_5 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5,6};
		int i,sum=0;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println("Sum of elements in the array is "+sum);
		
	}

}
