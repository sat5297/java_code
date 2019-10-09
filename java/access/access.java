class access
{
	int a=1 ;
	public int b=1;
	private int c=1;

	void setc(int c)
	{
		this.c = c;	//this refers to the calling object
	}
	int getc()
	{
		return c;
	}
}

