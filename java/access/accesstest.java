class accesstest
{
	public static void main(String args[])
	{
		access ob = new access();
                System.out.println("before : " + ob.a + " " + ob.b + " " + ob.getc());
		ob.a = 10;
		ob.b = 20;
		//ob.c = 100;		//illegal for private variables
		ob.setc(100);
		System.out.println("after  : " + ob.a + " " + ob.b + " " + ob.getc());

	}
}
