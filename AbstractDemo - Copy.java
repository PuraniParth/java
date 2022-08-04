abstract class shape
{
	abstract void area(int r);
}

class circle extends shape
{
	public void area(int r)
	{ 
	System.out.println(3.14*r*r);
	}
}
class Tri extends shape
{
public void area(int r)
{ System.out.println(0.5*r*r);}
}
class rect extends shape
{
public void area(int r)
{ System.out.println(r*r);}
}
class AbstractDemo
{
public static void main(String args[])
{
shape s;
s=new circle();
s.area(5);
s=new Tri();
s.area(2);
s=new rect();
s.area(4);
}
}
