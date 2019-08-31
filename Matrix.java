import java.util.*;
class Matrix1
{
 float m[][]=new float[2][2];
 int i,j,r,c;
 Matrix1()
 {
  for(i=0;i<2;i++)
  {
   for(j=0;j<2;j++)
   {
    m[i][j]=0;
   }
  }
}
Matrix1(int p,int q)
{
 r=p;
 c=q;
 Scanner se=new Scanner(System.in);
 System.out.println("Enter elements in Matrix");
 for(i=0;i<r;i++)
 {
  for(j=0;j<c;j++)
  {
   m[i][j]=se.nextFloat();
  }
 }
}
Matrix1(Matrix1 ob)
{
 r=ob.r;
 c=ob.c;
 for(i=0;i<r;i++)
 {
  for(j=0;j<c;j++)
  {
   m[i][j]=ob.m[i][j];
  } 
}
}
float determinant()
{
 return (m[0][0]*m[1][1])-(m[0][1]*m[1][0]);
}
void inverse()
{
 float temp;
 float det=determinant();
 if(det!=0.0)
 {				
  temp=m[0][0];
  m[0][0]=m[1][1];
  m[1][1]=temp;
  m[0][1]=0-m[0][1];
  m[1][0]=0-m[1][0];
  for(i=0;i<2;i++)
  {
   for(j=0;j<2;j++)
   {
    m[i][j]=m[i][j]/det;
   }
  }			
 }
  else
  System.out.println("Inverse can not b determined");
}
boolean singular()
{
 if(determinant()!=0.0)
 {	
  return true;
 }
 else 
 {
  return false;
 }
}
void print_data()
{
 if(determinant()!=0.0)
 {
  for(i=0;i<2;i++)
  {
   for(j=0;j<2;j++)
   {
    System.out.print(m[i][j]+" ");
   }
   System.out.print("\n");
  }
 }
}
}
class Matrix
{
 public static void main(String args[])
 {
  Matrix1 m1= new Matrix1(2,2);  
  Matrix1 m2 = new Matrix1(m1); 
  float e1 =m1.determinant();
  System.out.println("Determinant of matrix M1 is :   " + e1);
  System.out.println("Inverse of matrix M1 is :   "); 
  m1.inverse();
  m1.print_data();
  System.out.println("matrix M1 is :   " + m1.singular());
  float e2 =m2.determinant();
  System.out.println("Determinant of matrix M2 is :   " + e2);
  System.out.println("Inverse of matrix M2 is :   ");
  m2.inverse();
  m2.print_data();
  System.out.println("matrix M2 is :   " + m2.singular());
} 
}
