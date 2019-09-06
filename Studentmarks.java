import java.util.* ;
class Studentmarks
    {
     public static void main(String args[]) 
		{
     Scanner sc=new Scanner(System.in) ;
     System.out.println("enter the number of students \n") ;
		 int n=sc.nextInt() ;
		 System.out.println("enter the number of subjects \n") ;
		 int m=sc.nextInt() ;
		 int arr[][]=new int[n][m] ;
		 
		
		 for(int x=0;x<n;x++)
		 {
                  System.out.println("enter the marks (out of 100)of student  "+(x+1)+"\n") ;
		  for(int y=0;y<m;y++)
		  {
                   arr[x][y]=sc.nextInt() ;
                   }
		 }
		 
		 float sum=0 ;
		 for(int x=0;x<n;x++)
		 { for(int y=0;y<m;y++)
		  {sum+= arr[x][y];}
		 System.out.println("the total marks of student "+(x+1)+" is "+sum+"and the average marks are "+sum/m+"\n") ;
		 sum=0 ;
		 }
		 for(int y=0;y<m;y++)
		 { for(int x=0;x<n;x++)
		  {sum+= arr[x][y];}
		 System.out.println("the total marks in subject "+(y+1)+" is "+sum+"and the average marks are "+sum/n+"\n") ;
		 sum=0 ;
		 }
		}
	 }
