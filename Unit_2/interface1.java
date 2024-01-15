interface I1
{
	int a = 10;
	// int a; (Throws an error, variable must be assigned)
	// void disp(); (Error: Access specifier must be public)
	public void disp();
	public void disp1();
}
class C1 implements I1
{
	public void disp()
	{
		System.out.println("Class C1");
	}
	public void disp1(){}
}
class C2 implements I1
{
	public void disp()
	{
		System.out.println("Class C2");
	}
	public void disp1(){}

}
class interface1
{
	public static void main(String[] args) {
		C1 c = new C1();
		c.disp();

		C2 c2 = new C2();
		c2.disp();
	}
}