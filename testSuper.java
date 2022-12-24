class A
{
	A()
	{
	System.out.println("Super Method");
	}
}
class B extends A
{
	B()
	{
	super();
	//super.show();
	System.out.println("Sub method");
	//System.out.println(super.a);
	}
}
class testSuper
{
	public static void main(String[] args) {
	B r = new B();
	//r.show();
	}
}
