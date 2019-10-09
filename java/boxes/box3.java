class box3
{
	void call()
	{
		System.out.println("hello box3");
	}	
	public static void main(String args[])
	{
		System.out.println("are objects transitive");
		box2 trans = new box2();
		trans.call();
	}

}


