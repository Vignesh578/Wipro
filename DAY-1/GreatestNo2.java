package vipro;
import java.io.*;
import java.util.Scanner;

import java.util.Scanner;
public class GreatestNo2 { 
	public static void main(String[] args)   
	{  
	int num1,num2;
	System.out.println("Enter the Number1:");
	Scanner sc = new Scanner(System.in);
	num1=sc.nextInt();
	System.out.println("Enter the Number2:");
	Scanner s = new Scanner(System.in);
	num2=s.nextInt();
	if(num1<num2)  
	{  
	System.out.println(num2+" is the Greatest Number.");  
	}   
	else if (num1>num2)
	{  
	System.out.println(num2+" is the Smallest Number");  
	}  
	else
	{
		System.out.println("Both Numbers are equal!");  
	}
	}
	}  

