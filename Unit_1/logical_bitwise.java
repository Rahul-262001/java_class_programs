class logical_bitwise
{
	public static void main(String[] args) 
	{
		// Logical AND
		int n = 100;
		boolean val = (n%2 == 0) && (n%3 == 0);
		System.out.println("Result of Logical AND: "+val);

		// Bitwise AND
		int a = 10, b = 15; 
		System.out.print("Result of Bitwise AND: ");
		System.out.println(a&b);

		// Logical OR
		val = (n%2 == 0) || (n%3 == 0);
		System.out.println("Result of Logical OR: "+val);

		//Bitwise OR
		System.out.print("Result of Bitwise OR: ");
		System.out.println(a|b);

		// Logical NOT
		val = !(n%3 == 0);
		System.out.println("Result of Logical NOT: "+val);

		//Left Shift
		System.out.print("Left Shifted variable a: ");
		System.out.println(a<<1);

		// Right Shift
		System.out.print("Right Shifted variable b: ");
		System.out.println(b>>2);

		// XOR
		System.out.print("Result of Bitwise XOR: ");
		System.out.println(a^b);

		// >>>
		System.out.println(a>>>b); //What does it do? 

	}
}