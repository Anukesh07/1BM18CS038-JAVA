import java.util.*;
class Sort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				if(a[i]>a[j])
				{
					int k=a[j];
					a[j]=a[i];
					a[i]=k;
				}
			}
		}
		System.out.println("The sorted array is :");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}	
}