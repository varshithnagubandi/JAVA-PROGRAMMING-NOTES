package conditionalstatements;

import java.util.Scanner;

public class Switchcase1 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number from 1 to 7");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THRUSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			break;
		default:
			System.out.println("Enter the valid number to get output");
			
		}
	}

}
