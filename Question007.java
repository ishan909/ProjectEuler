package euler;

public class Question007
{
	public static void main(String[] args)
	{
		int count = 0;
		for (int i = 3; i < 1000000000; i++)
		{
			if (testPrime(i))
			{
				//System.out.println(count);
				count++;
				if (count == 10001)
				{
					System.out.println(i);
					System.exit(0);
				}
			}
		}
	}
	
	private static boolean testPrime(int i)
	{
		for (int j = 3; j < i; j++)
		{
			if (i % j == 0)
			{
				return false;
			}
		}
		return true;
	}
	
}
