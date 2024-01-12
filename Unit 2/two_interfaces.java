// Use 2 interfaces to affect multiple inheritance

abstract class A
{
	abstract void foo1();
}

abstract class B
{
	abstract void foo2();
}

class C extends A, B
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

class two_interfaces
{
	public static void main(String[] args) 
	{
		C c = new C();
		c.foo1();
		c.foo2();
	}
}