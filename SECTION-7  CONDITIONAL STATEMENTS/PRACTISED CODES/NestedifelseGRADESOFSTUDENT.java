package conditionalstatements;

import java.util.Scanner;

public class NestedifelseGRADESOFSTUDENT {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of the student");
		int a=sc.nextInt();
		if(a>=90)
		{
			System.out.println("Student got A grade");
		}
		else if(a>=80)
		{
			System.out.println("Student got B grade");
		}
		else if(a>=70)
		{
			System.out.println("Student got C grade");
		}
		else if(a>=60)
		{
			System.out.println("Student got D grade");
		}
		else if(a>=50)
		{
			System.out.println("Student got E grade");
		}
		else if(a>=40)
		{
			System.out.println("Student got F grade");
			
		}
		else if(a>=30)
		{
			System.out.println("PLEASE FOCUS ON STUDY");
		}
		else
		{
			System.out.println("BETTER LUCK NEXT TIME STAY FOCUSSED");
		}
	}

}
