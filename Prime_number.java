package com.oops9;
import java.util.Scanner;
public class Prime_number 
{
   public static void main(String[]args)
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	String S=Checking_factors(a);
	System.out.println(S);
   }
   public static String Checking_factors(int a)
   {
	   String res;
	   if(Factors(a)==2)
	   {
		   res=a+" is a prime number";
	   }
	   else
	   {
		   res=a+" is not a prime number";
	   }
	   return res;
   }
   public static int Factors(int a)
   {
	   int count=0;
	   for(int i=1;i<=a;i++)
	   {
		   if(a%i==0)
		   {
			   count++;
		   }
	   }
	   return count;
   }
}
