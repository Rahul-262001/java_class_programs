class Car
{
	String brand, model;
	int year;

	Car(String b, String m, int y)
	{
		this.brand = b;
		this.model = m;
		this.year = y;
	}
	void disp()
	{
		System.out.println("Brand: "+this.brand+"\nModel: "+this.model+"\nYear: "+this.year);
	}
	// void disp(int n)
	// {
	// 	System.out.println("NA");
	// }
}
class Main
{
	public static void main(String[] args) {
		Car c1 = new Car("Tata", "Nexon", 2023), c2 = new Car("Buick", "LeSabre", 1995);
		c1.disp();
		// c1.disp(1);
		c2.disp();
	}
}