// Find volume of an ice cream cone
import java.util.*;
class a1b
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double r = s.nextDouble();
		System.out.println("Enter height: ");
		double h = s.nextDouble();
		System.out.println("Volume of Cornetto cone with radius "+r+
			" u. and height "+h+" u. is "+vol(r,h)+" cu. ");
	}
	static double vol(double r, double h)
	{
		return 22*r*r*h/21;
	}
}