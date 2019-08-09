import java.util.*;
class Fibonacci
{
public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of the term you want to know");
	int n=sc.nextInt();
	int c;
	int a=1;
	int b=1;
	int count=2;
	while(count<n)
		{
		c=b;
		b=a+b;
		a=c;
		count++;
		}
	System.out.println("The nth term is "+b);
	}
}
		
		