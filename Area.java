import java.util.*;
import java.lang.Math.*;
abstract class Shape
{
	double x,y;
	public abstract double printArea();
}
class Rectangle extends Shape
{
	public double printArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		x=sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle");
		y=sc.nextDouble();
		return x*y;	
	}
}
class Triangle extends Shape
{
	public double printArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height of the triangle");
		x=sc.nextDouble();
		System.out.println("Enter the base of the triangle");
		y=sc.nextDouble();
		return 0.5*x*y;	
	}
}
class Circle extends Shape
{
	public double printArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		x=sc.nextDouble();
		return Math.PI*x*x;	
	}
}
class Area
{
	public static void main(String[] args)
	{
		Shape obj1=new Rectangle();
		System.out.println(obj1.printArea());
		Shape obj2=new Triangle();
		System.out.println(obj2.printArea());
		Shape obj3=new Circle();
		System.out.println(obj3.printArea());
	}
}
