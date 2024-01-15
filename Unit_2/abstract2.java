abstract class C1{
	int a;
	C1()
	{
		System.out.println("Abstract Class");
	}
	void set(int a)
	{
		this.a = a;
	}
	void disp()
	{
		System.out.println("A: "+this.a);
	}
}
class Child1 extends C1{
	Child1(int a){
		super();
		super.set(a);
	}
	void display(){
		super.disp();
	}
}
class abstract2{
	public static void main(String[] args){
		// C1 c = new C1(); // Throws an error, can't create an object for abstract class
		Child1 c = new Child1(10);
		// c.set(5);
		c.display();
	}
}