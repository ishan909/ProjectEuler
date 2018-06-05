package euler;

public class Question004
{
	public static void main(String[] args)
	{
		long ans = 0;
		for (long i = 100; i < 1000; i++)
		{
			for (int j = 100; j < 1000; j++) {
				long sqr = i * j;
				if (isPal(sqr)) 
				{
					if (sqr > ans)
					{
						ans = sqr;
					}
				} 
			}
		}
		System.out.println(ans);
	}

	private static boolean isPal(long sqr)
	{
		int length = getDigits(sqr);
		
		String s = String.valueOf(sqr);
		boolean t = true;
		
		for (int i = 0; i < length / 2 && t; i++)
		{
			if (!s.substring(i, i + 1).equals(s.substring(length - i - 1, length - i)))
			{
				t = false;
			}
		}
		return t; 
	}
	
	private static int getDigits(long sqr)
	{
		int dig = 0;
		while (sqr > 0)
		{
			sqr /= 10;
			dig++;
		}
		return dig;
	}
}
