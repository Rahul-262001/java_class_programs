// Find nPr and nCr
import java.util.*;
class a2a
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = s.nextInt();
		System.out.println("Enter r: ");
		int r = s.nextInt();
		if(n>=r && n>-1 && r>-1)
		{
			System.out.println(n+"P"+r+" = "+npr(n,r));
			System.out.println(n+"C"+r+" = "+ncr(n,r));
		}
		else
			System.out.println("Invalid inputs. Retry. ");
	}
	static int fact(int n)
	{
		int i, f = 1;
		for(i=1;i<=n;i++)
			f*=i;
		return f;
	}
	static int npr(int n, int r)
	{
		return fact(n)/fact(n-r);
	}
	static int ncr(int n, int r)
	{
		return npr(n,r)/fact(r);
	}
}