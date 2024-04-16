class LogicalOps
{
	public static void main(String[] args)
	{
		int a = 4;
		int b = 4;
		int c = 8;

		boolean result = a == b && b < c;
		boolean result2 = a == b && b > c;

		System.out.println(result);
		System.out.println(result2);
	}
}