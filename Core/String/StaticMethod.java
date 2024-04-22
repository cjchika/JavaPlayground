class Mobile 
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

			Mobile.name = "Phone";

			Mobile mob1 = new Mobile();
			mob1.brand = "Apple";
			mob1.price = 2000;

			Mobile mob2 = new Mobile();
			mob2.brand = "Samsung";
			mob2.price = 2400;

			mob1.show();
			mob2.show();

			Mobile.display();
    }
}