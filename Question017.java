package euler;

public class Question017
{
	public static void main(String[] args)
	{
		long count = 11;
		for (int i = 1; i < 1000; i++)
		{
			
			if (i / 100 == 9 || i / 100 == 5 || i / 100 == 4)
			{
				count += 14;
			}
			else if (i / 100 == 8 || i / 100 == 7 || i / 100 == 3)
			{
				count += 15;
			}
			else if (i / 100 == 6 || i / 100 == 2 || i / 100 == 1)
			{
				count += 13;
			}
			
			if (i % 100 == 0)
			{
			count -= 3;
			}
			
			if (i % 100 < 10) // 0 - 9
			{
				count += singles(i);
			}
			else if (i % 100 < 20) // 10 - 20
			{
				count += teens(i);
			}
			else if (i % 100 < 40)
			{
				count += 6;
				count += singles(i);
			}
			else if (i % 100 < 70)
			{
				count += 5;
				count += singles(i);
			}
			else if (i % 100 < 80)
			{
				count += 7;
				count += singles(i);
			}
			else if (i % 100 < 100)
			{
				count += 6;
				count += singles(i);
			}
		}
		System.out.println(count);
	}
	
	public static long singles(int i)
	{
		if (i % 10 == 0)
		{
			return 0;
		}
		else if (i % 10 == 1 || i % 10 == 2 || i % 10 == 6)
		{
			return 3;
		}
		else if (i % 10 == 3 || i % 10 == 7 || i % 10 == 8)
		{
			return 5;
		}
		else if (i % 10 == 4 || i % 10 == 5 || i % 10 == 9)
		{
			return 4;
		}
		return 0;
	}
	
	public static long teens(int i)
	{
		if (i % 10 == 0)
		{
			return 3;
		}
		else if (i % 100 == 11 || i % 100 == 12)
		{
			return 6;
		}
		else if (i % 100 == 13 || i % 100 == 14 || i % 100 == 18 || i % 100 == 19)
		{
			return 8;
		}
		else if (i % 100 == 15 || i % 100 == 16)
		{
			return 7;
		}
		else if (i % 100 == 17)
		{
			return 9;
		}
		return 0;
	}
}
