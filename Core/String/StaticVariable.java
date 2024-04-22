class Mobile 
{
	String brand;
	int price;
	static String name;

	public void show(){
		System.out.println(brand + " : " + price + " : " + name);
	}
}

public class StaticVariable {
    public static void main(String[] args){

			Mobile.name = "Phone";

			Mobile mob1 = new Mobile();
			mob1.brand = "Apple";
			mob1.price = 2000;

			mob1.show();

			Mobile mob2 = new Mobile();
			mob2.brand = "Samsung";
			mob2.price = 2400;

			mob2.show();
    }
}