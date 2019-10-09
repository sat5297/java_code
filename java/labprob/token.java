import java.util.*;
class customer
{
	String name,dob;
	Scanner sc = new Scanner(System.in);
	void read()
	{
		name = sc.next();
		dob = sc.next();		//for each object i should read these values
	}
	void display()
	{
		System.out.println("name : "+name + "dob : ");
		StringTokenizer st = new StringTokenizer(dob, "/");
		//now i have given the de-limiter
		while(st.hasMoreTokens())
		{
			String val = st.nextToken();
			System.out.print(val);
			if(st.countTokens() != 0)
				System.out.print(",");
		}
		System.out.println();
	}
}
class token
{
	public static void main(String args[])
	{
		System.out.println("enter name and dob \n");
		customer obj = new customer();
		obj.read();
		obj.display();
	}
}
