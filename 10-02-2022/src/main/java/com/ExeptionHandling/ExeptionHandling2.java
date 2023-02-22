package com.ExeptionHandling;

import java.util.Scanner;

public class ExeptionHandling2 
{
	public static void main(String[] args) 
	{
		//multiple catch blocks
		Scanner scanner=new Scanner(System.in);

		try
		{
			System.out.println("Start of code");
			System.out.println("Enter a string: ");
			String str=scanner.nextLine();
			char ch=str.charAt(str.length());
			System.out.println("Charecter found is: "+ch);
			System.out.println("End of code");
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		catch(NullPointerException ne)
		{
			ne.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			ai.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException si)
		{
		si.printStackTrace();
		}
		catch(Exception e)
		{	
			System.out.println("Exception found "+e);
			e.printStackTrace();
		}
		finally{
			{
				System.out.println("Exception Handled!!End Of Program!!");
			}
			scanner.close();
			try
			{
				int ar[]=new int[5];
				ar[5]=78;
				
			
			}
			catch(ArithmeticException ae)
			{
				ae.printStackTrace();
			}
			catch(NullPointerException ne)
			{
			ne.printStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException ai)
			{
				ai.printStackTrace();
			}
			catch(StringIndexOutOfBoundsException si)
			{
				System.out.println("String exception found");
				si.printStackTrace();
			}
			finally
			{
				scanner.close();
				System.out.println("End Of Program!!");
				}
		}

	}
		
	 }

