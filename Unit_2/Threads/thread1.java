import java.util.*;
class thread1 extends Thread
{
	String name;
	thread1(String name)
	{
		this.name = name;
		System.out.println("Thread Created "+this.name);
		// System.out.println("Name: "+this.name);
	}
	public void run()
	{
		System.out.println("Thread running "+this.name);
		// System.out.println("Name: "+this.name);
	}
	public void stop()
	{
		exit();
	}
	
	public static void main(String[] args) 
	{
		thread1 t1 = new thread1("Example");
		t1.start();
		System.out.println("Example is alive: "+t1.isAlive());
		t1.stop();
		System.out.println("Example is alive (After stop()): "+t1.isAlive());

		thread1 t2 = new thread1("Example 2");
		t2.start();
		System.out.println("Example 2 is alive: "+t2.isAlive());

		thread1 t3 = new thread1("Example 3");
		t3.start();
		System.out.println("Example 3 is alive: "+t3.isAlive());
	}
}