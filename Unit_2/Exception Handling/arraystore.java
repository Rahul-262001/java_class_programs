import java.util.*;
class arraystore
{
	public static void main(String[] args) throws ArrayStoreException
	{
		Object[] ob = new Integer[10];

		try
		{
			Object a = 5;
			System.out.println(a);
			System.out.println(a.getClass());
			a = 5.5;
			System.out.println(a);
			System.out.println(a.getClass());
			Object b = new Object();
			System.out.println(b);
			System.out.println(b.getClass());

			ob[0] = 1;
			System.out.println(ob[0]);
			ob[1] = "ABC";
			System.out.println(ob[1]);
			System.out.println(ob.getClass());
		}
		catch(ArrayStoreException e)
		{
			// System.out.println("Exception Occured");
			// e.printStackTrace();
			ob[1] = 2;
		}
		finally
		{
			System.out.println(ob[1]);
			System.out.println(ob.getClass());
			try
			{
				ob[2] = "DEF";
			}
			catch(ArrayStoreException e)
			{
				// ob[2] = 3;
			}
			finally
			{
				System.out.println(ob[2]);
				System.out.println(ob.getClass());
			}
		}
	}
		
}