class Final
{
	final int a = 10;
	void seta(int x)
	{
	/*	this.a = x;
		i cannot modify final variables here 
		error: cannot assign a value to final variable a
		this.a = x;
		    ^
	*/

	}
	public static void main(String args[])
	{
		Final test = new Final();
		//test.seta(1);
		System.out.println(test.a);
	}
}

