class absarea
{
    public static void main(String args[])
    {
        //fig f = new fig(10,10);
        //here i cannot create obj of an abstract class
        rect r  = new rect(9, 5);
        triangle t = new triangle(10, 8);
        fig figref;
        figref = r;     //runtime polymorphism using dynamic dispatch 
        System.out.println("area is " + r.area());
        figref = t;
        System.out.println("area is " + t.area());
        
    }
}
