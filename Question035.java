package euler;

public class Question035
{
	public static void main(String[] args)
	{
		int max = 1000000;
		int circularPrimeCount = 1;
		for (int tempI = 3; tempI < max; tempI += 2)
		{
			int i = tempI;
			int digits = getDigits(i);
			int digitSpinCount = 0;
			boolean circularPrime = true;
			while (digitSpinCount < digits)
			{
				if (!testPrime(i))
				{
					circularPrime = false;
					break;
				}
				int endingDigits = (int) (i % Math.pow(10, digits - 1));
				int startingDigit = (int) (i / Math.pow(10, digits - 1));
				i = endingDigits * 10 + startingDigit;
				digitSpinCount++;
			}
			if (circularPrime)
			{
				System.out.println(tempI);
				circularPrimeCount++;
			}
		}
		System.out.printf("Total number of circular prime numbers below %d: %d\n", max, circularPrimeCount);
		System.out.println(new java.util.Date());
	}
	
	private static int getDigits(int n)
	{
		int dig = 0;
		while (n > 0)
		{
			n /= 10;
			dig++;
		}
		return dig;
	}
	
	private static boolean testPrime(long i)
	{
		for (int j = 2; j < (int) Math.sqrt(i) + 1; j++)
		{
			if (i % j == 0)
			{
				return false;
			}
		}
		return true;
	}
}