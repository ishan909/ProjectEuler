package euler;

import java.math.BigInteger;

public class Question036
{
	public static void main(String[] args)
	{
		BigInteger ONE_MILLION = new BigInteger("1000000");
		BigInteger decimal = BigInteger.ONE;
		BigInteger sum = BigInteger.ZERO;
		while (decimal.compareTo(ONE_MILLION) == -1)
		{
			if (isPal(decimal))
			{
				BigInteger binary = new BigInteger(decimal.toString(2));
				if (isPal(binary))
				{
					sum = sum.add(decimal);
				}
			}
			decimal = decimal.add(BigInteger.ONE);
		}
		System.out.println(sum);
	}
	
	private static boolean isPal(BigInteger number)
	{
		BigInteger reverseNumber = inverse(number);
		if(number.compareTo(reverseNumber) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private static BigInteger inverse(BigInteger forward)
	{
		BigInteger backward = BigInteger.ZERO;
		int digits = getBigDigits(forward);
		int i = 0;
		while (true)
		{			
			backward = backward.add(forward.mod(BigInteger.TEN));
			i++;
			if (i >= digits)
			{
				break;
			}
			backward = backward.multiply(BigInteger.TEN);
			forward = forward.divide(BigInteger.TEN);
		}
		return backward;
	}
	
	private static int getBigDigits(BigInteger current)
	{
		int digit = 0;
		while (current.compareTo(BigInteger.ZERO) == 1)
		{
			current = current.divide(BigInteger.TEN);
			digit++;
		}
		return digit;
	}
}
