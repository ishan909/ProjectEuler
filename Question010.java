package euler;

public class Question010 {

	public static void main(String[] args)
	{
		long sum = 2;
		for (int i = 3; i < 2000000; i += 2)
		{
			if (testPrime(i))
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	private static boolean testPrime(long i)
	{
		for (long j = 3l; j < Math.sqrt(i) + 1; j++)
		{
			if (i % j == 0)
			{
				return false;
			}
		}
		return true;
	}

}
