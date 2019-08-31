import java.util.* ;
class Book1
{ 
  String name ;
  String author ;
  int pages ;
  int price ;
  
  Book1(String n,String a,int p,int pr)
  { 
    name=n ;
    author=a ;
    pages=p ;
    price=pr ;
  }

  Book1()
  {  
    name="name" ;
    author="author" ;
    pages=0 ;
    price=0 ;
  }
   
  
  void set()
  {  
     Scanner sc=new Scanner(System.in) ;
     System.out.println("enter name of the book\n") ;
     name=sc.next() ;
     System.out.println("enter name of the author\n") ;
     author=sc.next() ;
     System.out.println("enter number of pages in the book\n") ;
     pages=sc.nextInt() ;
     System.out.println("enter price of the book\n") ;
     price=sc.nextInt() ;
  }
  public String toString()
  {  
    return "the name of the book is "+name+"\n the name of the author is "+author+"\nthe number of pages are "+pages+"\nthe price of the book is "+price  ; }
  }
  class Book
  {
  public static void main(String args[])
  {
    Book1 b1=new Book1("harry potter","J.K rowling",256,200) ;
    System.out.println(b1) ;
    Book1 b2=new Book1() ;
    b2.set() ;
    System.out.println(b2) ;
}
}
