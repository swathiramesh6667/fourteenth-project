package com.ExeptionHandling;

import java.util.Scanner;

public class ExeptionHnadling1 
{
	static String Str="swathi";

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner (System.in);

		System.out.println("Hello BTS! ");

		System.out.println(Str.length());

		System.out.println("End Program");

		int ar[]=new int[5];

		System.out.println("Enter values: ");

		for(int i=0;i<=ar.length;i++)
		{
			ar[i]=scanner.nextInt();
		}

		for(int i=0;i<=ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		scanner.close();
	}

}
