package euler;

public class Question108
{
	public static void main(String[] args)
	{		
		for (int n = 2; ; n++)
		{
			if (numberOfSolutions(n) >= 1000)
			{
				System.out.println("Answer: " + n);
				System.out.println("Number of Solutions: " + numberOfSolutions(n));
				System.out.println("FINISHED at " + new java.util.Date());
				break;
			}
			if (n % 1000 == 0)
			{
				System.out.println(n + " at " + new java.util.Date());
			}
		}
	}
	
	private static int numberOfSolutions(int n)
	{
		int count = 0;
		for (double x = n * 2; x > n; x--)
		{
			double oneOverY = (1.0 / n) - (1 / x);
			double y = Math.round(1000 / oneOverY) / 1000.0;
			if (y == (int) y)
				count++;
		}
		return count;
	}
}
