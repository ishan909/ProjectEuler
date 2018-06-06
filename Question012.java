package euler;

public class Question012
{
	public static void main(String[] args)
	{
		for (long i = 1; ; i++)
		{
			long tri = 0;
			for (long j = i; j > 0; j--)
			{
				tri += j;
			}
			long factors = factors(tri);
			if (factors > 100)
			{
				System.out.println(tri + " " + factors); 
				if (factors > 500)
				{
					System.out.println(tri);
					break;
				}
			}
		}
	}

	public static long factors(long tri)
	{
		long facts = 0;
		for (long i = 1; i <= Math.sqrt(tri) + 1; i++)
		{
			if (tri % i == 0)
			{
				facts++;
			}
		}
		return facts * 2;
	}
}
