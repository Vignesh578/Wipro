package vipro;
import java.io.*;
import java.util.Scanner;

public class evenodd2
{  
public static void main(String[] args)   
{  
int num1,num2,SUM;
System.out.println("Enter the Number1:");
Scanner sc = new Scanner(System.in);
num1=sc.nextInt();
System.out.println("Enter the Number1:");
Scanner s = new Scanner(System.in);
num2=s.nextInt();
SUM=num1+num2;
if(SUM%2==0)  
{  
System.out.println(SUM+" is the Even Number.");  
}   
else
{  
System.out.println(SUM+" is the Odd Number.");  
}  
}
}