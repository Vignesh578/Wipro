package vipro;
public class isevenfunc   
{  
public static void main(String[] args)   
{  
int a = 20;   

int c = add(a);     
System.out.println(c);  
}  

public static int add(int n1)     
{  
int i=0;
if (n1%2==0)
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