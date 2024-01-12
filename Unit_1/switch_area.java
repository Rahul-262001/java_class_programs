import java.util.*;
class switch_area
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("1. Circle\n2. Square\n3. Rectangle\n4. Triangle\nEnter your choice: ");
		int ch = s.nextInt();

		switch(ch)
		{
			case 1:
				System.out.println("Enter radius: ");
				float r = s.nextFloat();
				System.out.println("Area of circle: "+areaCalc(r));
				break;
			case 2: 
				System.out.println("Enter length of a side: ");
				int sd = s.nextInt();
				System.out.println("Area of square: "+areaCalc(sd));
				break;
			case 3: 
				System.out.println("Enter length: ");
				float l = s.nextFloat();
				System.out.println("Enter breadth: ");
				float b = s.nextFloat();
				System.out.println("Area of Rectangle: "+areaCalc(l,b));
				break;
			case 4: 
				System.out.println("Enter three sides of Triangle: ");
				int s1 = s.nextInt(), s2 = s.nextInt(), s3 = s.nextInt();
				System.out.println("Area of Triangle: "+areaCalc(s1,s2,s3));
				break;
			default:
				System.out.println("Invalid. Retry.");
		}
	}

	static float areaCalc(float r)
	{
		return 22*r*r/7f;
	}
	static int areaCalc(int sd)
	{
		return sd*sd;
	}
	static float areaCalc(float l, float b)
	{
		return l*b;
	}
	static double areaCalc(int a, int b, int c)
	{
		float s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}