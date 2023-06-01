package com.oops9;
import java.util.Scanner;
public class Perfect_square 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	 String output=Checking_Perfectsquare(a);
	 System.out.println(output);
  }
  public static String Checking_Perfectsquare(int a)
  {
	  String res;
	  if(Square(a))
	  {
		  res=a+" is a Perfect square";
	  }
	  else
	  {
		  res=a+" is not a Perfect square";
	  }
	  return res;
  }
  public static boolean Square(int a)
  {
	  boolean b=false;
	  for(int i=1;i<=a/2;i++)
	  {
		  if(i*i==a)
		  {
			  b=true;
		  }
	  }
	  return b;
  }
}
