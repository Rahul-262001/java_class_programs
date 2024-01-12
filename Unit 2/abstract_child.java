// Can a child class be abstract
class A
{
	int a;
	A(int a)
	{
		this.a = a;
		System.out.println("Parent Class Constructor");
	}
	void disp()
	{
		System.out.println("Parent Class: "+this.a);
	}
}
abstract class B extends A
{
	int a;
	B(int a)
	{
		super(a);
		System.out.println("abstract child class B");
		this.a = a;
		// super(a);
	}
	void disp()
	{
		System.out.println("Child Class B: "+this.a);
		super.disp();

	}
	abstract void foo();
}
class C extends B
{
	C(int a)
	{
		super(a);
	}
	void foo()
	{
		super.disp();
	}
}
class abstract_child
{
	public static void main(String[] args) 
	{
		// B b = new B(5); // B is abstract; cannot be instantiated
		// b.disp();
		C c = new C(5);
		c.foo();
	}
}