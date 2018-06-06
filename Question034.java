package euler;

public class Question034
{
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 3; ; i++)
		{
			if (i == getSum(i))
			{
				sum += i;
				System.out.println(sum);
			}
			// PROGRAM DOES NOT BREAK
		}
	}

	private static int getSum(int i)
	{
		int sum = 0;
		while (i > 0)
		{
			sum += factorial(i % 10);
			i /= 10;
		}
		return sum;
	}

	private static int factorial(int i)
	{
		if (i == 0)
			return 1;
		else if (i == 1)
			return 1;
		return i * factorial(i - 1);
	}
}
