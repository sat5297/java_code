import java.util.*;
class exceptHandling
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a and b\n");
		a = sc.nextInt();
		b = sc.nextInt();
		try
		{
			int res = a/b;
			System.out.println("Result : " + res);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			//System.out.println("Exception caught : " + e );
		}
	}
}
