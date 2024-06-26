class Mobile1
{
	String brand;
	int price;
	static String name;

	public void show(){
		System.out.println(brand + " : " + price + " : " + name);
	}

	public static void display()
	{
		System.out.println( name + "In static method");
	}
}

public class StaticMethod {
    public static void main(String[] args){

		Mobile1.name = "Phone";

		Mobile1 mob1 = new Mobile1();
			mob1.brand = "Apple";
			mob1.price = 2000;

		Mobile1 mob2 = new Mobile1();
			mob2.brand = "Samsung";
			mob2.price = 2400;

			mob1.show();
			mob2.show();

		Mobile1.display();
    }
}