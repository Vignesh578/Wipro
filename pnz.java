package vipro;
import java.io.*;
import java.util.Scanner;

public class pnz
{  
public static void main(String[] args)   
{  
int num;
System.out.println("Enter the Number:");
Scanner sc = new Scanner(System.in);
num=sc.nextInt();
if(num>0)  
{  
System.out.println(num +" is positive Number.");  
}   
else if(num<0)  
{  
System.out.println(num +" is negative Number.");  
}    
else  
{  
System.out.println("The number is zero.");  
}  
}  
}  
