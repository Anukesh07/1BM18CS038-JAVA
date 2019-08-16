import java.util.*;
class Operation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrices");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int m1[][]=new int[r][c];
		int m2[][]=new int[r][c];
		System.out.println("Enter the elements of matrix 1 :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of matrix 2 :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		System.out.println("The addition of the matrices is :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println(m1[i][j]+m2[i][j]);
			}
		}
		System.out.println("The subtraction of the matrices is :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println(m1[i][j]-m2[i][j]);
			}
		}
	}
}