class cmdline
{
	public static void main(String[] args) 
	{
		// System.out.println(args[0]);
		System.out.println("Total arguments: "+args.length);
		System.out.println("Arguments passed: ");
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);
	}
}