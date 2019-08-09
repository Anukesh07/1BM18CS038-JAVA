import java.util.*;
class Quadratic
{
public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the co-efficients");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=(b*b)-(4*a*c);
	if(d>0)
	{
	System.out.println("Roots are real");
	double r1=(-b+Math.sqrt(d))/(2*a);
	double r2=(-b-Math.sqrt(d))/(2*a);
	System.out.println("The roots are "+r1+" and "+r2);
	}
	else	if(d==0)
		{
		System.out.println("Roots are equal");
		float r=-b/(2*a);
		System.out.println("The roots are "+r+" and "+r);
		}
	else
	{
	System.out.println("No real solutions");
	}
	}
}
	