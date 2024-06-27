package array;

public class Leftrotation_7 {
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,5,6};
		int i,temp;
		temp=a[0];
		System.out.println("Elements before the left shift : ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		System.out.println();
		System.out.println("Elements after the left shift : ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
