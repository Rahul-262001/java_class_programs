// Defining an abstract class public
// Runtime error: Main method not found in class public_abstract_class
public abstract class public_abstract_class
{
	public static void main(String[] args) 
	{
		new Abc().disp();
	}
	abstract void disp();
}
class Abcd extends public_abstract_class
{
	
	void disp()
	{
		System.out.println("public abstract class");
	}
}