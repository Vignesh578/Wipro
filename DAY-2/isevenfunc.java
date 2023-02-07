package vipro;
import java.util.*;
public class isevenfunc   
{  
public static void main(String[] args)   
{  
int a,c;   
Scanner sc=new Scanner(System.in);
System.out.println("Enter the No:");
a=sc.nextInt();
c=add(a); 
System.out.println(c);  
}  

public static int add(int n1)     
{  
int i=0;
if(n1%2==0)
{
	i+=2;
}
else
{
	i++;
}  
return i;  
}  
}  
