import java.util.*;
class Book{
  String name, auth;
  int price, num_pages;
  Scanner s = new Scanner(System.in);
  Book(){
    name = "";
    auth = "";
    price = 0;
    num_pages = 0;
  }
  void set(String a, String b, int c, int d){
    name = a;
    auth = b;
    price = c;
    num_pages = d;
  }
  void get(){
    System.out.println("Enter the Name of the Book -");
    name = s.next();
    System.out.println("Enter the Author of the Book -");
    auth = s.next();
    System.out.println("Enter the Price of the Book -");
    price = s.nextInt();
    System.out.println("Enter the Number of Pages in the Book -");
    num_pages = s.nextInt();
  }
  public String toString(){
    String s;
    s = ("The Name of the Book is - "+name+"\nThe Author of the Book is - "+auth+"\nThe Price of the Book is - "+price+"\nThe  number of pages in the book is - "+num_pages);
    return s;
  }
}
class bookDemo{
  public static void main(String[] args) {
    int i, n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number of Books -");
    n = sc.nextInt();
    Book b[] = new Book[n];
    for(i = 0; i < n ; i++){
      System.out.println("Enter the Details of the book "+(i+1));
      b[i] = new Book();
      b[i].get();
    }
    for(i = 0; i < n ; i++){
      System.out.println("Printing the Details of the Book "+(i+1));
      System.out.println(b[i]);
    }
  }
}
