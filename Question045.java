package euler;

public class Question045
{
	public static void main(String[] args)
	{
		for (long n = 286; ; n++)
		{
			if (isPentagonal(n * (n + 1) / 2) && isHexagonal(n * (n + 1) / 2))
			{
				System.out.println("n: " + n);
				System.out.println("Answer: " + n * (n + 1) / 2);
				System.out.println(new java.util.Date());
				break;
			}
		}
	}
	
	private static boolean isPentagonal(long num)
	{
		double zero1 = (1 + Math.sqrt(1 + 24 * num)) / 6;
		double zero2 = (1 - Math.sqrt(1 + 24 * num)) / 6;
		if (zero1 > 0 && zero1 % 1 == 0)
			return true;
		if (zero2 > 0 && zero2 % 1 == 0)
			return true;
		return false;
	}
	
	private static boolean isHexagonal(long num)
	{
		double zero1 = (1 + Math.sqrt(1 + 8 * num)) / 4;
		double zero2 = (1 - Math.sqrt(1 + 8 * num)) / 4;
		if (zero1 > 0 && zero1 % 1 == 0)
			return true;
		if (zero2 > 0 && zero2 % 1 == 0)
			return true;
		return false;
	}
}
