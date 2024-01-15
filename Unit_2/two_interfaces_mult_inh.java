// Use 2 interfaces to affect multiple inheritance

abstract class A
{
	public abstract void foo1();
}

interface B
{
	public abstract void foo2();
}

class C extends A implements B
{
	public void foo1()
	{
		System.out.println("foo1");
	}
	public void foo2()
	{
		System.out.println("foo2");
	}
}

class two_interfaces_mult_inh
{
	public static void main(String[] args) 
	{
		C c = new C();
		c.foo1();
		c.foo2();
	}
}