package array;

public class Declarationofarray {
	public static void main(String arg[])
	{
		int i;
		int A[]= {1,2,3,4,5};
		System.out.println("Printing of elements");
		for(i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
			
		}
		System.out.println();
		System.out.println("Printing of elements in REVERSE ORDER");
		for(i=A.length-1;i>=0;i--)
		{
			System.out.print(A[i]+" ");
		}
	}

}
