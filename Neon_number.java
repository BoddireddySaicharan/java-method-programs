package com.oops9;
import java.util.Scanner;
public class Neon_number
{
   public static void main(String[] args) 
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	 int b=a*a;
	 String S=Check_SumOfDigits(a,b);
	 System.out.println(S);
   }
   public static String Check_SumOfDigits(int a,int b)
   {
	   String res;
	   if(SumOfDigits(b)==a)
	   {
		   res=a+" is a neon number";
	   }
	   else
	   {
		   res=a+" is not a neon number";
	   }
	   return res;
   }
   public static int SumOfDigits(int b)
   {
	   int sum=0;
	   while(b>0)
	   {
		   int dig=b%10;
		   sum=sum+dig;
		   b=b/10;
	   }
	   return sum;
   }
}
