import java.util.*;
class Time
{
	int h;int m;int s;	
	Time(int a,int b,int c)
	{
		h=a;m=b;s=c;

	}
	Time()
	{
		int h=0;int m=0;int s=0;
	}
	void currentTime(int a,int b,int c)
	{
		h=a;m=b;s=c;
	}
	void advance(int a,int b,int c)
	{
		s=s+c;
		m=m+b+(s/60);
		s=s%60;
		h=h+a+(m/60);
		m=m%60;
		h=h%24;
	}
	void print()
	{
		System.out.println("Hour = "+h);
		System.out.println("Minute = "+m);
		System.out.println("Second = "+s);
	}
}
class TimeDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Enter your choice : ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: Time a=new Time();
			System.out.println("Enter the hour, minute and second");
			int hh=sc.nextInt();
			int mm=sc.nextInt();
			int ss=sc.nextInt();
			a.currentTime(hh,mm,ss);
			a.print();
			break;
			case 2: 
			System.out.println("Enter the hour, minute and second");
			int hh1=sc.nextInt();
			int mm1=sc.nextInt();
			int ss1=sc.nextInt();		
			Time b=new Time(hh1,mm1,ss1);
			System.out.println("Enter the hour, minute and second");
			int hh2=sc.nextInt();
			int mm2=sc.nextInt();
			int ss2=sc.nextInt();
			b.advance(hh2,mm2,ss2);
			b.print();
			break;
		}
	}
}
