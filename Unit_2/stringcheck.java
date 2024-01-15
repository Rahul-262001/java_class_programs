class stringcheck
{
	public static void main(String[] args) 
	{
		Integer i = 5;
		System.out.println(i.getClass());
		String s = "";
		System.out.println(s.getClass());
		int j = 0;
		Object j1 = (Object)j;
		System.out.println(((Object)j).getClass());
		System.out.println(j1.getClass());
	}
}