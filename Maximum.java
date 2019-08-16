import java.util.*;
class Maximum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the elements of the array :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int max=a[0][0];
		for(int a1[]:a)
		{
			for(int x:a1)
			{
				if(x>max)
				{
					max=x;
				}
			}
		}
		System.out.println("The maximum element in the array is "+max);	
	}
}