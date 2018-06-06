package euler;

public class Question112
{
	public static void main(String[] args)
	{
		int count = 0;
		
		int i = 99;
		while (count / (double) i != .99)
		{
			i++;
			if (isBouncy(i))
			{
				count++;
			}
		}
		System.out.println(i);
	}

	private static boolean isBouncy(int i)
	{
		boolean increasing = false;
		
		int temp1 = i % 10;
		i /= 10;
		int temp2 = i % 10;
		
		while (temp1 == temp2)
		{
			temp1 = i % 10;
			i /= 10;
			temp2 = i % 10;
		}
		
		if (temp1 > temp2)
			increasing = true;
		
		if (increasing)
		{
			while (i / 10 > 0)
			{
				temp2 = i % 10;
				i /= 10;
				int temp3 = i % 10;
				if (temp2 < temp3)
					return true;
			}
		}
		else
		{
			while (i / 10 > 0)
			{
				temp2 = i % 10;
				i /= 10;
				int temp3 = i % 10;
				if (temp2 > temp3)
					return true;
			}
		}
		
		return false;
	}
}
