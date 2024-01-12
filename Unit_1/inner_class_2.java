class OuterClass 
{
	static int outer_x = 10;
	int outer_y = 20;
	private int outer_private = 30;

	class InnerClass 
	{
		void display()
		{
			System.out.println("outer_x = " + outer_x);

			System.out.println("outer_y = " + outer_y);

			System.out.println("outer_private = " + outer_private);
		}
	}
}
public class inner_class_2 
{
	public static void main(String[] args)
	{
		OuterClass outerObject = new OuterClass();
	
		OuterClass.InnerClass ob = outerObject.new InnerClass();

		ob.display();
	}
}
