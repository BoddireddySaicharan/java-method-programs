package com.oops9;

import java.util.Scanner;

public class Sunny_number 
{
	public static void main(String[] args) 
	  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		 String output=Checking_Sunnynumber(a);
		 System.out.println(output);
	  }
	  public static String Checking_Sunnynumber(int a)
	  {
		  String res;
		  if(Square_1(a))
		  {
			  res=a+" is a Sunny number";
		  }
		  else
		  {
			  res=a+" is not a Sunny number";
		  }
		  return res;
	  }
	  public static boolean Square_1(int a)
	  {
		  boolean b=false;
		  for(int i=1;i<=a;i++)
		  {
			  if((i*i)-1==a)
			  {
				  b=true;
			  }
		  }
		  return b;
	  }
}
