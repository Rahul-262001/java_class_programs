// Find distance between two points
import java.util.*;
class a1c
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter coordinates for home: ");
		double x1 = s.nextDouble(), y1 = s.nextDouble();
		System.out.println("Enter coordinates for PESU: ");
		double x2 = s.nextDouble(), y2 = s.nextDouble();
		System.out.println("Distance between home and PESU: "
			+dist(x1,y1,x2,y2)+" units");
	}
	static double dist(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	}
}