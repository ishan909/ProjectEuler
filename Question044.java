package euler;

import java.util.ArrayList;

public class Question044
{
	public static void main(String[] args)
	{
		int smallestDifference = 100000000;
		ArrayList<Integer> pentagonals = new ArrayList<Integer>();
		for (int i = 1; i < 10000; i++)
		{
			pentagonals.add(i * (3 * i - 1) / 2);
		}
		
		for (int first = 0; first < pentagonals.size(); first++)
		{
			for (int second = first + 1; second < pentagonals.size(); second++)
			{
				int sum = ((int) pentagonals.get(first)) + ((int) pentagonals.get(second));
				int difference = ((int) pentagonals.get(second)) - ((int) pentagonals.get(first));
				if (isPentagonal(sum) && isPentagonal(difference))
				{
					if (difference < smallestDifference)
					{
						smallestDifference = difference;
						System.out.println(smallestDifference);
					}
				}
			}
		}
		System.out.println(smallestDifference);
		System.out.println(new java.util.Date());
		
	}
	
	private static boolean isPentagonal(int num)
	{
		double zero1 = (1 + Math.sqrt(1 + 24 * num)) / 6;
		double zero2 = (1 - Math.sqrt(1 + 24 * num)) / 6;
		if (zero1 > 0 && zero1 % 1 == 0)
			return true;
		if (zero2 > 0 && zero2 % 1 == 0)
			return true;
		return false;
	}
}
