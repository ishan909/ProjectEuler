package euler;

public class Question005
{
	public static void main(String[] args)
	{
		for (int i = 2520; ; i += 2)
		{
			for (int j = 2; j <= 20; j ++)
			{
				if (i % j == 0)
				{
					if (j == 20)
					{
						System.out.println(i);
						System.exit(0);
					}
				}
				else
				{
					break;
				}
			}
		}	
	}
}