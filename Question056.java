package euler;

import java.math.BigInteger;

public class Question056
{
	public static void main(String[] args)
	{
		int largest = 0;
		for (BigInteger a = BigInteger.ONE; a.compareTo(new BigInteger("100")) < 0; a = a.add(BigInteger.ONE))
		{
			for (int b = 1; b < 100; b++)
			{
				int sum = digitSum(a.pow(b));
				if (sum > largest)
				{
					largest = sum;
					System.out.println("a: " + a + " b: " + b + " sum: " + sum);
				}
			}
		}
		System.out.println(largest);
	}
	
	private static int digitSum(BigInteger number)
	{
		BigInteger sum = BigInteger.ZERO;
		while (number.compareTo(BigInteger.ZERO) > 0)
		{
			sum = sum.add(number.remainder(BigInteger.TEN));
			number = number.divide(BigInteger.TEN);
		}
		return sum.intValue();
	}
}
