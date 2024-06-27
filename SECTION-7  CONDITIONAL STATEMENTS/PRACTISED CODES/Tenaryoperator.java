package conditionalstatements;

import java.util.Scanner;

public class Tenaryoperator {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner (System.in);
		int largest;
		System.out.println("Enter the num1");
		int num1=sc.nextInt();
		System.out.println("Enter the num2");
		int num2=sc.nextInt();
		largest=(num1>num2)?num1:num2;
		System.out.println("LARGEST NUMBER IS :"+largest);
		
	}

}
