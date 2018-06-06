package euler;

public class Question009
{
	public static void main(String[] args)
	{
		for (int a = 1; a < 1000; a++)
		{
			for (int b = a; b < 1000; b++)
			{
				double c = Math.sqrt(a * a + b * b);
				if ((c == Math.floor(c)) && !Double.isInfinite(c))
				{
					System.out.println(a + " " + b + " " + c);
					if (a + b + c == 1000)
					{
						System.out.println("found");
						long product = (long) (a * b * c);
						System.out.println(product);
						System.exit(0);
					}
				}
			}	
		}
	}
}
