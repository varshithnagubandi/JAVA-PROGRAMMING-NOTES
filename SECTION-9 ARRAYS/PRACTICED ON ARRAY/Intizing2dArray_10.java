package array;

public class Intizing2dArray_10 {
	public static void main(String arg[])
	{
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
