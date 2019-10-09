import java.util.*;
class staff
{
	int staffid

	staff()
	{

	} 
	void read()
	{
		Scanner s1  = new Scanner(System.in);
		System.out.println(“enter staff id”);
		StafId= s1.next();
		System.out.println(“enter name”);
		name= (s1.next());
		System.out.println(“enter phone”);
		phone= (s1.next());
		System.out.println(“enter salary”);
		salary= (s1.nextInt());
	}
}
