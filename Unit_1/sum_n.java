class sum_n
{
	public static void main(String[] args) {
		int n = 5;
		System.out.println("Sum of first "+n+" natural numbers is "+sumn(n));
	}

	static int sumn(int n)
	{
		return n*(n+1)/2;
	}
}