class sum_of_digits_while
{
	public static void main(String[] args) {
		int n = 1234;
		int r, s = 0;
		int x = n;
		while(n>0)
		{
			r = n%10;
			s += r;
			n /= 10;
		}
		System.out.printf("Sum of digits of %d is %d\n", x, s);

	}
}