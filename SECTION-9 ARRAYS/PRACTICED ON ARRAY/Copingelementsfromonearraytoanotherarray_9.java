package array;

import java.util.Scanner;

public class Copingelementsfromonearraytoanotherarray_9 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5,6};
		int b[]=new int[6];
		int i;
		for(i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}

}
