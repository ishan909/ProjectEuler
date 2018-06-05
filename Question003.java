package euler;

public class Question003
{
	public static void main(String[] args)
	{
		long n = 600851475143l;
		long ans = 0l;
		for (long i = 3l; i < (int)Math.sqrt(n) + 1; i += 2)
		{
			if (n % i == 0)
			{
				if (testPrime(i) && i > ans)
				{
					System.out.println(i);
					ans = i;
				}
				long opp = n / i;
				if (testPrime(opp) && i > ans)
				{
					System.out.println(opp);
					ans = i;
				}
			}
		}
		System.out.println(ans);
	}

	private static boolean testPrime(long i)
	{
		for (long j = 3l; j < (int)Math.sqrt(i) + 1; j++)
		{
			if (i % j == 0)
			{
				return false;
			}
		}
		return true;
	}
}
