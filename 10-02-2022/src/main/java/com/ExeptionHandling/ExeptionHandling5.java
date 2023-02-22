package com.ExeptionHandling;

import java.util.Scanner;

public class ExeptionHandling5 {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Two Numbers: ");

		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int result;

		try
		{
			result=num1/num2;
			System.out.println(result);
		}
		catch(Exception e)//generalized catch block
		{
			System.out.println("Exception Encoundered!!");
		}
		scanner.close();
	}

}
