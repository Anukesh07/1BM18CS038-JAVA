import java.util.* ;
class Student1
{
 String usn ;
 String name ;
 float credits[]=new float[5] ;
 float marks[]=new float[5] ;
 float sgpa ;
 void input()
 {
	Scanner sc=new Scanner(System.in) ;
	System.out.println("enter the name of the student \n") ;
	name=sc.next() ;
	System.out.println("enter the usn of the student \n") ;
	usn=sc.next() ;
	System.out.println("enter the marks in five subjects out of 100 \n") ;
	for(int x=0;x<5;x++)
	{
	 marks[x]=sc.nextFloat() ;
	}
	System.out.println("enter the credits in five subjects out of 10 \n") ;
	for(int x=0;x<5;x++)
	{
	 credits[x]=sc.nextFloat() ;
	}
 }
 void sgpa()
 {
	 sgpa=(marks[0]*credits[0]+marks[1]*credits[1]+marks[2]*credits[2]+marks[3]*credits[3]+marks[4]*credits[4])/100 ;
	
 }   
 void output()
 {
	System.out.println(" the name of the student is "+name+"\n") ;
	System.out.println(" the usn of the student is "+usn+"\n") ;
        System.out.println(" the sgpa of the student is "+sgpa+"\n") ;
 }
}
class Student
{
 public static void main(String[] args)
 {
 	Student1 st=new Student1() ;
	st.input() ;
	st.sgpa() ;
	st.output() ;
 }
}
