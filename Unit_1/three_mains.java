class three_mains
{
	static void main(int i) {
		System.out.println(i);
	}

	static void main(String s){
		System.out.println(s);
	}

	public static void main(String[] args) {
		main(1);
		main("ABC");
	}
}