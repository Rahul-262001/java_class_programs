class overloaded_area
{
	public static void main(String[] args) 
	{
		overloaded_area oa = new overloaded_area();

		int r = 10;
		int x = 5, y = 2;
		float s = 6.5f;

		System.out.println("Area of circle: "+oa.area(r));

		System.out.println("Area of rectangle: "+oa.area(x, y));

		System.out.println("Area of square: "+oa.area(s));		

	}

	double area(int r)
	{
		return 22*r*r/7.0;
	}

	int area(int x, int y)
	{
		return x*y;
	}

	float area(float s)
	{
		return s*s;
	}
}