package com.oops9;
import java.util.Scanner;
public class Perfect 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	 String output=check_Factors(a);
	 System.out.println(output);
  }
  public static String check_Factors(int a)
  {
	  String res;
	  if(Factors_Sum(a)==a)
	  {
		  res=a+" is a Perfect number";
	  }
	  else
	  {
		  res=a+" is not a Perfect number";
	  }
	  return res;
  }
  public static int Factors_Sum(int a)
  {
	  int sum=0;
	  for(int i=1;i<a;i++)
	  {
		  if(a%i==0)
		  {
			  sum=sum+i;
		  }
	  }
	  return sum;
  }
}
