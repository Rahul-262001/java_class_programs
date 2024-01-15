class autobox
{
	public static void main(String[] args) 
	{
		int n = 5;
		System.out.println(((Object)n).getClass());
		float f = 5.0f;
		System.out.println(((Object)f).getClass());
		String a = "ABC";
		System.out.println(a.getClass());
		char ch = 'a';
		System.out.println(((Object)ch).getClass());

		Integer i = 5; // Integer i = new Integer(5);
		Integer j = 5;
		System.out.println(i.getClass());
		System.out.println(j.getClass());
		System.out.println(i+j); // i.getValue() + j.getValue();
		// System.out.println((i+j).getClass());
		Integer k = i+j;
		System.out.println(k);
		System.out.println(k.getClass());
	}
}