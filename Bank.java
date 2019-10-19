import java.util.*;
class account
  {
    Scanner sc=new Scanner(System.in);
    String name,number;
    void getdata()
      {
        System.out.println("Enter the name and account number of customer");
        name=sc.next();
        number=sc.next();
      }
    void deposite(){
      }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Account Number:"+number);
      }
    void interest(){
      }
    void withdrawal(){
      }
    void cheque(){
      }
    void penalty(){
      }
   }
 class savacc extends account
   {
     Scanner sc=new Scanner(System.in);
     double bal=0;
     void getdata()
        {
          super.getdata();
        }
     void deposite()
        {
          System.out.println("Enter the amount to be deposited");
          double dep=sc.nextFloat();
          bal=bal+dep;
        }
      void display()
        {
          super.display();
          System.out.println("Balance in the account:"+bal);
        }
     void interest()
        {      
          int rate=3;
          System.out.println("Enter the time");
          int time=sc.nextInt();
          double ci=bal*Math.pow((100+rate)/100,time);
          System.out.println("Interest:"+ci);
          bal=bal+ci;
         }
     void withdrawal()
         {
           System.out.println("Enter the withdrawal amount ");
           double withdrawal=sc.nextDouble();
           if(bal>=withdrawal)
              {
                bal=bal-withdrawal;
              }
            else
              {
                System.out.println("There is no sufficient amount");
              }
         }
     void cheque()
          {
            System.out.println("There is no cheque book facility for savings account");
          }
     void penalty()
          {
            System.out.println("There is no penalty for savings bank account");
          }
  }
 class curracc extends account
   {
     Scanner sc=new Scanner(System.in);
     double bal=0;
     void getdata()
        {
          super.getdata();
        }
     void deposite()
        {
          System.out.println("Enter the amount to be deposited");
          double dep=sc.nextDouble();
          bal=bal+dep;
        }  
      void display()
        {
          super.display();
          System.out.println("Balance in the account:"+bal);
        }
      void interest()
        {
          System.out.println("There is no intrest for current account");
        }
     void withdrawal()
        {
          System.out.println("There is no withdrawal facility available");
        }
     void cheque()
        {
          System.out.println("Enter the cheque amount");
          double amt=sc.nextDouble();
          if(amt<=bal)
             {
               bal=bal-amt;
             }
          else
             {
               System.out.println("There is no sufficient amount");
             }
         }
     void penalty()
         {
           if(bal<500)
             {
               System.out.println("penalty is imposed");
               bal=bal-20;
              }
           else
            System.out.println("No penalty is imposed");
         }
    }
 class accountdemo
    {
       public static void main(String args[])
        {
           int i=1;
           Scanner sc=new Scanner(System.in);
           System.out.println("1.Savings Account  2.Current Account ");
           int ch=sc.nextInt();
           account ob=null;
           switch(ch)
             {   
                case 1: ob= new savacc();
                         ob.getdata();
                        break;
                case 2: ob=new curracc();
                         ob.getdata();
                        break;
             }
             while(i==1)
             {
                  System.out.println("What are you going to do.....");
                  System.out.println("1.Deposite 2.Display details 3.interest calculation 4.Withdrawal 5.Cheque 6.Verify penatly 7.Exit");       
                  int c=sc.nextInt();
                  switch(c)
                   {
                     case 1: ob.deposite();
                             break;
                     case 2: ob.display();
                             break;
                     case 3: ob.interest();
                             break;
                     case 4: ob.withdrawal();
                             break;
                     case 5: ob.cheque();
                             break;
                     case 6: ob.penalty();
                             break;
                     case 7:i++;
                            break;
                   }
            }
         

         }
   }
