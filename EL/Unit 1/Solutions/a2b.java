/* Display
1
1	2
1	2	3 
and so on */
import java.util.*;
class a2b
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int i, j, c = 1;
		System.out.println("Enter number of lines: ");
		int n = s.nextInt();
		if(n>0)
		{
			int a[][] = new int[n][];
			for(i=0;i<n;i++)
				a[i] = new int[i+1];
			for(i=0;i<n;i++)
				for(j=0;j<a[i].length;j++)
					a[i][j] = c++;
			System.out.println("Pattern: ");
			for(i=0;i<n;i++)
			{
				for(j=0;j<a[i].length;j++)
					System.out.print(a[i][j]+"	");
				System.out.println();
			}
		}
		else
			System.out.println("Positive integers only. ");
	}
}