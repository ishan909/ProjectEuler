package euler;

public class Question021
{
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 2; i < 10000; i++)
		{
			int sod = sumOfDivisors(i);
			if (sumOfDivisors(sod) == i && sod != i)
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	private static int sumOfDivisors(int n)
	{
		int sum = 0;
		for (int i = 1; i < n / 2 + 1; i++)
		{
			if (n % i == 0)
			{
				sum += i;
			}
		}
		return sum;
	}
}
