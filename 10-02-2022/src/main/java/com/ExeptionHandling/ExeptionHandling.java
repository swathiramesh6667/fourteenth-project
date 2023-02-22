package com.ExeptionHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExeptionHandling {

	public static void main(String[] args) throws IOException,NullPointerException//Exception Declaration
	{
		//try with resources 
		//java 8 :  allow you to create the resources(objects) 
		//implements AutoCloseable interface : 

		//try with resources 
		//java 8 :  allow you to create the resources(objects) 
		//implements AutoCloseable interface : 

		try(Scanner scanner=new Scanner(System.in);FileInputStream fout=new FileInputStream("f1.txt");)
		{


		}
		//				catch(Exception e)
		//				{
		//					
		//				}

	}

}