import java.io.*;
import java.util.*;
class stack 
{
	int arr[],top,size;
	stack(int size)
	{
		this.size = size;
		arr = new int[size];
		top = -1;
	}
	void push(int x)
	{
		if(top == size-1)
			System.out.println("the stack is full\n ");
		else
			arr[++top] = x;
	}
	void pop()
	{
		if(top==-1)
			System.out.println("the stack is underflow\n");
		else 
			System.out.println("the removed item is : " + arr[top--]);
	}
	void display()
	{
		if(top == -1)
			System.out.println("the stack is empty\n");
		else 
		{
			int i;
			for(i = top ; i>=0 ; i--)
				System.out.println(arr[i]);
		}		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=5;
		stack s = new stack(n);
		while(true)
		{
			System.out.println("push-1 , pop-2 , display-3 , exit-4\n");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					//enter element
					s.push(sc.nextInt());
					break;
				case 2:
					s.pop();
					break;
				case 3:
					s.display();
					break;
				case 4:
					System.exit(0);
				
			}
		}
	}
}
