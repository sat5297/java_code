//inheritance heirarchy 
class A
{
	void showA()
	{
		System.out.println("i am in a");
	}
}

class B extends A
{
	void showB()
	{
		System.out.println("i am in b");
	}
}

class C extends B
{
	void showC()
	{
		System.out.println("i am in c");
	}
	public static void main(String args[])
	{
		C test = new C();
		test.showA();
		test.showB();
		test.showC();
	}
}
