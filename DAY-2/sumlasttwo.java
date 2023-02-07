package vipro;
import java.util.*;

public class sumlasttwo {
	public static void main(String[] ar)
	{
		int a,b,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No1:");
		a=sc.nextInt();
		Scanner d=new Scanner(System.in);
		System.out.println("Enter No2:");
		b=d.nextInt();
		f=sum(a,b);
		System.out.println("Sum :"+f);
	}
	public static int sum(int inp1,int inp2)
	{
		int a,b,c,d,SUM;
		a=inp1%10;
		b=(a<0?-a:a);
		c=inp2%10;
		d=(c<0?-c:c);
		SUM=b+d;
		return SUM;
	}

}
