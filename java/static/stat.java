class stat
{
	static int a = 3;
	static int b;
	static void meth(int x)
	{
		System.out.println(x + " " + a + " " + b);
	}
	static
	{
		System.out.println("do i come here first time ");
		b  = a*2;
	}
	//as soon as we run this class all static instances get executed 
	//here this static portion above also gets exec before main?
	public static void main(String args[])
	{
		//here after removing this function the static {} part gets executed as it is but the meathod does not obviously 	
	//	meth(42);
	}
}

