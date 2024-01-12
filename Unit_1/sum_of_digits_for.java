class sum_of_digits_for
{
	public static void main(String[] args) {
		int n = 1234;
		int r, s = 0;
		int x = n;
		for(n=n;n>0;n/=10)
		{
			// r = n%10;
			// s+=r;
			s += n%10;
		}
		System.out.printf("Sum of digits of %d is %d\n", x, s);

	}
}