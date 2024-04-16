class Main
{
	public static void main(String[] args)
	{
		int y = 11;
		int z = 10;
    int a = 9;

		if(y > z && y > a){
			System.out.println(y);
		} else if(a > z) {
			System.out.println(a);
		} else{
			System.out.println(z);
		}
	}
}