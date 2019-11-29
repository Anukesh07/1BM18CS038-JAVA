import java.util.*;
class WrongAge extends Exception{}
class Father{
    Father(){}
    Father(int age) throws WrongAge{
        if (age <= 0){
            throw new WrongAge();
        }
    }
}
class Son extends Father{
    Son(int fatage, int sonage) throws WrongAge{
        if(sonage >= fatage){
            throw new WrongAge();
        }
    }
}
class fathersonexception{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            int choice;
            do{
                System.out.println("1. Create Father Object\n2. Create Son Object\n3. Exit");
                choice = sc.nextInt();
                switch(choice){
                    case 1: System.out.print("Enter Father's Age : ");
                            new Father(sc.nextInt());
                            break;
                    case 2: System.out.print("Enter Father's and Son's age : ");
                            new Son(sc.nextInt(), sc.nextInt());
                            break;
                    case 3: return;
                }
            }while(choice != 3);
        }
        catch(WrongAge e){
            System.out.println("Caught Wrong Age Exception");
        }
        finally{
            System.out.println("In Finally");
        }
    }
}
