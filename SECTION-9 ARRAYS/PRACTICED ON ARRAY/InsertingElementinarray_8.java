package array;

import java.util.Scanner;

public class InsertingElementinarray_8 {
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		int n,i,index,m;
		int a[]= new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		m=6;                   //length of array
		System.out.println("Enter the element that you wanted to insert :");
		n=sc.nextInt();
		System.out.println("Enter the index where you wanted to insert");
		index=sc.nextInt();
		System.out.println("Before inserting the array is : ");
		for(i=0;i<m;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=m-1;i>=index;i++)
		{
			a[i+1]=a[i];
		}
		a[index]=n;
		System.out.println("After inserting the array become : ");
		for(i=0;i<m+1;i++)
		{
			System.out.print(a[i]+" ");
		}
				
		
	}

}
