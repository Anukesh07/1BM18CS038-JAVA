import java.util.* ;
class Points
{int x ;
 int y ;
 double d ;
 Points(int a,int b)
 {
   x=a ;
   y=b ;
 }

 Points()
 { x=0 ;y=0 ;}
 
 Points(Points p1)
 {
  x=p1.x ;
  y=p1.y ;
 }
 double distance(Points p2)
 {
  d=Math.sqrt((x-p2.x)*(x-p2.x)+(y+p2.y)*(y+p2.y)) ;
  return d ;
 }
}
class Point
{ public static void main(String args[]) 
 {
  System.out.println("enter the co-ordinates of the point\n") ;
  Scanner sc= new Scanner(System.in) ;
  int a=sc.nextInt() ;
  int b=sc.nextInt() ;
  Points p3=new Points(a,b) ;
 
  System.out.println("enter the co-ordinates of the point\n") ;
  
  int c=sc.nextInt() ;
  int d=sc.nextInt() ;
  Points p6=new Points(c,d) ;

  Points p4=new Points(2,3) ;
  Points p5=new Points(p3) ;
  System.out.println("the distance between the points is "+ p3.distance(p6)) ;
  p3.distance(p6) ;
 }
}
