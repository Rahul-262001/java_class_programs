// Change left-most digit to right-most
import java.util.*;
class a3
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = s.nextInt();
		int x = n, i, d = 0, r = 0, m = 0;
		System.out.println("Given number: "+n);
		for(n=n;n>0;n/=10)
			d = n%10;
		System.out.println(d);
		int y = d;
		n = x;
		System.out.println(n);
		// for(n=n;n>0;n/=10)
		// {
		// 	r = n%10;
		// 	y += (r*10);
		// }
		n *= 10;
		n += d;
		// n = n >>> 1 | (n & 1) << 63;
		x = n;
		System.out.println("Modified: "+n);
		for(n=n;n>0;n/=10)
		{
			m *= 10 + (n%10);
		}
		
	}
}