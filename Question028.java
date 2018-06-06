package euler;

public class Question028
{
	public static void main(String[] args)
	{
		long sum = 0;
		int n = 2;
		int i = 1;
		int j = 0;
		int grid = 1001;
		for ( ; j < (grid - 2) * (grid - 2); i += 2, n += 2)
		{
			j = i * i;
			for (int four = 0; four < 4; four++)
			{
				sum += j + (n * four);
			}
		}
		sum += grid * grid;
		System.out.println(sum);
	}
}
