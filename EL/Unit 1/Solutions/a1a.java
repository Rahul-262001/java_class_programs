// Find area of a triangular park
import java.util.*;

class a1a
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three sides: ");
		double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble();
		System.out.println("Area of triangular park with sides "+a+", "+b+
			", and "+c+" units is "+calc(a,b,c)+" square units"); 
	}
	static double calc(double a, double b, double c)
	{
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}