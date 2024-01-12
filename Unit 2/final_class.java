// Declaring a class as final
import java.util.*;
final class Abc
{
	int a;
	Abc(int a)
	{
		this.a = a;
		System.out.println("final class");
	}
	void disp()
	{
		System.out.println(a);
	}
}

// class Child extends Abc // Can't inherit from final Abc
// {
// 	Child(int a)
// 	{
// 		super(a);
// 	}
// 	void disp()
// 	{
// 		super.disp();
// 	}
// }

class final_class
{
	public static void main(String[] args) 
	{
		// Child c = new Child(5);
		// c.disp();
		System.out.println("Enter a number: ");
		Abc a = new Abc(new Scanner(System.in).nextInt());
		a.disp();
	}
}