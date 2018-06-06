package euler;

import java.util.ArrayList;

public class Question047
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0); // 2
		list.add(0); // 3
		list.add(1); // 4		

		ArrayList<Integer> check = new ArrayList<Integer>();
		int length = 4;
		for (int i = 0; i < length; i++)
		{
			check.add(length);
		}

		for (int i = 5; ; i++)
		{
			list.add(countPrime(i));
			if (list.equals(check))
			{
				System.out.println(i - length + 1);
				break;
			}
			list.remove(0);
		}
	}
	
	private static int countPrime(int n)
	{
		int count = 0;
		for (int i = 2; i < n; i += 1)
		{
			if (n % i == 0)
			{
				if (testPrime(i))
				{
					count++;
				}
			}
		}
		return count;
	}
	
	private static boolean testPrime(long i)
	{
		for (long j = 2l; j < (int)Math.sqrt(i) + 1; j++)
		{
			if (i % j == 0)
			{
				return false;
			}
		}
		return true;
	}
}
