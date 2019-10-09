abstract class fig
{
	double a,b;
	fig(double a,double b)
	{
		this.a = a;
		this.b = b;
	}
	abstract double area(); 
}
class rect extends fig
{
	rect(double a,double b)
	{
		super(a,b);
	}
	//now meathod overriding 
	//now all my sub classes should override the abstract superclass
	//or they should themselves become abstract 
	double area()
	{
		System.out.println("inside rectangle ");
		return a*b;
	}
}
class triangle extends fig
{
	triangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("inside triangle");
		return 0.5*a*b;
	}
}
