import java.util.*;
class Rectangle
{
	int length,breadth;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle");
		length=sc.nextInt();
		breadth=sc.nextInt();
	}
	void area()
	{
		int area=length*breadth;
		System.out.println("Area of the rectangle with length "+length+" and breadth "+breadth+" is "+area);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		r1.input();
		r1.area();
		r2.input();
		r2.area();
	}
}