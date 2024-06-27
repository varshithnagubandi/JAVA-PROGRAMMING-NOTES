package array;

public class Sumof2array_11 {
	public static void main(String arg[])
	{
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int b[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int c[][]=new int[3][4];
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
