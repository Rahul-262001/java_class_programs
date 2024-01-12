abstract class C1{
	int a;
	C1()
	{
		System.out.println("Parent Class");
	}
	void set(int a)
	{
		this.a = a;
	}
	void disp()
	{
		System.out.println("A: "+this.a);
	}
	abstract void abst(); //Abstract Method in a non-abstract class, throws an error until C1 
		// is not abstract
	// abstract void abst1();
	void abst3(){
		System.out.println("Abstract Class Method");
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
	void abst(){
		System.out.println("Overriden");
	}
	void abst3(){
		System.out.println("Child Class Method");
		super.abst3();
	}
}
class abstract3{
	public static void main(String[] args){
		// C1 c = new C1(); // Throws an error, can't create an object for abstract class
		Child1 c = new Child1(10);
		// c.set(5);
		c.display();
		c.abst();
		c.abst3();
	}
}