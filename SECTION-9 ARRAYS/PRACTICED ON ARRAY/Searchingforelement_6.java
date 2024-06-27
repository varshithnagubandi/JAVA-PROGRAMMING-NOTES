package array;

import java.util.Scanner;

public class Searchingforelement_6 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner (System.in);
		int a[]={1,2,3,4,5,6};
		int i,key;
		System.out.println("Enter the key that you wanted to search : ");
		key=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				System.out.println("Element found at index "+i);
				System.exit(0);
				
			}
			
		}
		System.out.println("Element not found in the array");
		
	}

}
