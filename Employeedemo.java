import java.util.*;
 class Employee 
 {
    String emp_num,name;
    double basic,DA,IT,net_sal;
    
    void input(int i)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee_Number,name,Basic of employee "+(i+1));
        emp_num=sc.next();
        name=sc.next();
        basic=sc.nextInt();
    }
    
    void net_sal()
    {
        DA=basic*3/4;
        double gross=basic+DA;
        IT=gross*3/10;
        net_sal=basic+DA-IT;
        
    }
    void print()
    {
        System.out.println("The employee details are :\n Employee number:"+emp_num+"\n");
	System.out.println("Employee Name:"+name+"\n");
	System.out.println("DA:"+DA+"\nIT:"+IT+"\n");
	System.out.println("Net salary:"+net_sal+"\n");
    }
}
    
class Employeedemo
{
     
    public static void main(String args[])
    {
        System.out.println("Enter the number of employees");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Employee emp=new Employee();
        for(int i=0;i<n;i++)
        {
           emp.input(i);
           emp.net_sal();
           emp.print();
	}
    }
}
