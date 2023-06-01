package com.oops9;

import java.util.Scanner;

public class Spy_number 
{
	public static void main(String[] args) 
	  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		 String output=Checking_Spynumber(a);
		 System.out.println(output);
	  }
	  public static String Checking_Spynumber(int a)
	  {
		  String res;
		  if(Sum_digits(a)==Product_digits(a))
		  {
			  res=a+" is a Spy number";
		  }
		  else
		  {
			  res=a+" is not a Spy number";
		  }
		  return res;
	  }
	  public static int Sum_digits(int a)
	  {
		  int sum=0;
		 while(a>0)
		 {
			int dig=a%10;
			sum=sum+dig;
			a=a/10;
			
		 }
		  return sum;
	  }
	  public static int Product_digits(int a)
	  {
		  int pro=1;
		  while(a>0)
		  {
			  int dig=a%10;
			  pro=pro*dig;
			  a=a/10;
		  }
		  return pro;
	  }
}
