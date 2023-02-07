package vipro;

import java.util.Scanner;

public class lastseconddigit {
	public static void main(String[] args) {
	int a,c;   
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the No:");
	a=sc.nextInt();
	c=lastsecd(a); 
	System.out.println(c);  
}
public static int lastsecd(int n1)
{
	if(n1>9 || n1<-9)
	{
   	int b,c;       //235
   	b=n1/10;     //23
   	c=b%10;    //3
   	c=(c<0?-c:c);
   	return c;
	}
   	else
   	{
   		return -1;
   	}
}
}