class overloaded_main
{
	public static void main(String[] args) {
		System.out.println("First: "+(1+2));
	}
	public static int main(String[] args)
	{
		System.out.println("Overloaded main()");
		return 0;
	}
}
