import java.util.*;
class Person
{
	String name,address;
	int age;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the name of the student");
		name=sc.next();
		System.out.println("Enter the age of the student");
		age=sc.nextInt();
		System.out.println("Enter the address of the student");
		address=sc.next();
	}
}
class Student extends Person
{
	int roll,sem;
	Scanner sc=new Scanner(System.in);
	void input1()
	{
		System.out.println("Enter the roll number of the student");
		roll=sc.nextInt();
		System.out.println("Enter the semester of the student");
		sem=sc.nextInt();
	}
}
class Exam extends Student
{
	int marks1,marks2;
	Scanner sc=new Scanner(System.in);
	void input2()
	{
		System.out.println("Enter the marks of subject1 of the student");
		marks1=sc.nextInt();
		System.out.println("Enter the marks of subject2 of the student");
		marks2=sc.nextInt();
		float avg=(marks1+marks2)/2;
		System.out.println("The average is "+avg);
	}
}
class Topper
{
	public static void main(String args[])
	{
		System.out.println("Enter the number of students");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			Exam e=new Exam();
			e.input();
			e.input1();
			e.input2();
		}
	}
}
