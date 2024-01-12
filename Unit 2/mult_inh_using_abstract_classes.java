abstract class A
{
	void concrete1()
	{
		System.out.println("Concrete1");
	}
}

interface B
{
	public abstract void concrete2();
	// {
	// 	System.out.println("Concrete2");
	// }
}

class C extends A implements B
{
	void disp()
	{
		super.concrete1();
		concrete2();
		System.out.println("Class C");
	}
	public void concrete2()
	{
		System.out.println("Concrete2 overriden");
	}
}

class mult_inh_using_abstract_classes
{
	public static void main(String[] args) 
	{
		new C().disp();
	}
}