package vipro;
import java.io.*;
import java.util.Scanner;

public class EvenOdd
{  
public static void main(String[] args)   
{  
int num1;
System.out.println("Enter the Number1:");
Scanner sc = new Scanner(System.in);
num1=sc.nextInt();
if(num1%2==0)  
{  
System.out.println(num1+" is the Even Number.");  
}   
else
{  
System.out.println(num1+" is the Odd Number.");  
}  
}
}