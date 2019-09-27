import java.util.*;
interface Stack
{
	public void push();
	public void pop();
	public void check();
}
class Middle implements Stack
{
	int stack[],t=-1,el;
	stack=new int[size];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	size=next.Int();
	public void push()
	{
		if(*t==size-1)
    		{
        		System.out.println("Stack overflow");
        		return;
    		}
    		*t=*t+1;
    		s[*t]=el;
	}
	public void pop()
	{
    		if(t==-1)
    		{
        		System.out.println("Stack underflow");
		        return -9999;
    		}
		el=s[*t];
    		*t=*t-1;
    		return el;
	}
	public void check()
	{
		if(t==-1)
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
	}
}
class StackTest extends Middle
{
	public static void main(String[] args)
	{
		while(num!=0)
		{
	        	System.out.println("Enter 1 to push, 2 to pop and 3 to check and 0 for exit");
			Scanner sc=new Scanner(System.in);	        
			int num=nextInt();
			switch(num)
			{
        		case 1:
            			System.out.println("Enter the element to be pushed");
            			el=next.Int();
				public void push()
            			break;
			case 2:
            			System.out.println("You have chosen to pop");
       				public void pop()
            			break;
        		case 3:
            			public void check()
            			break;
        		default:
            			System.out.println("Program exited");
            			break;
    			}
		}    	
	}
    	return 0;
}
