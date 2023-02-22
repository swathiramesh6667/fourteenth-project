package com.ExeptionHandling;

public class Excep1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Hello world 1!!");
			int a=10/0;
			System.out.println("Hello world 2!!");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Array exception caught");
		}
		catch(Exception e)
		{
			System.out.println("Exeption caught");
		}
		finally
		{
			System.out.println("End the program!!");
		}
	}
	/*
	 * try-catch
	 * try with multiple catch
	 * try catch finally
	 * try finally
	 * 
	 * 
	 * 
	 */
}
