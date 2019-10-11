import java.util.*;
class Student
{
	String name;
	int usn,sem;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the name of the student");
		name=sc.next();
		System.out.println("Enter the USN of the student");
		usn=sc.nextInt();
		System.out.println("Enter the semester of the student");
		sem=sc.nextInt();
	
	}
}
class Test extends Student
{
	Scanner sc=new Scanner(System.in);
	int CIE[]=new int[6];
	void input1()
	{
		for(int i=0;i<6;i++)
		{
			CIE[i]=sc.nextInt();
		}
	}
	int credit[]=new int[6];
	void input2()
	{
		for(int i=0;i<6;i++)
		{
			credit[i]=sc.nextInt();
		}
	}
}
class Exam extends Test
{
	Scanner sc=new Scanner(System.in);
	int SEE[]=new int[6];
	void input3()
	{
		for(int i=0;i<6;i++)
		{
			SEE[i]=sc.nextInt();
		}
	}
	int totals[]=new int[6];
	void total()
	{
		for(int i=0;i<6;i++)
		{
			totals[i]=(SEE[i]/2)+CIE[i];
		}
	}
}
class Result extends Exam
{
	int GPA[]=new int[6];
	void grades()
	{
		for(int i=0;i<6;i++)
		{
			if(totals[i]>=90)
				GPA[i]=10;
			else if(totals[i]>=75&&totals[i]<90)
				GPA[i]=9;
			else if(totals[i]>=60&&totals[i]<75)
				GPA[i]=8;
			else if(totals[i]>=50&&totals[i]<60)
				GPA[i]=7;
		}
		
	}
}
