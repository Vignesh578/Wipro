package vipro;

import java.util.Scanner;

public class lastdigit {
	public static void main(String[] args) {
	int a,c;   
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the No:");
	a=sc.nextInt();
	c=lastd(a); 
	System.out.println(c);  
}
public static int lastd(int n1)
{
   	int b;
   	b=n1%10;
   	b=(b<0?-b:b);
   	return b;
}
}