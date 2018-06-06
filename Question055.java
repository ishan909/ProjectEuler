package euler;

import java.math.BigInteger;

public class Question055
{
	public static void main(String[] args)
	{
		int lychrelNumbers = 0; // count for how many lychrelNumbers
		BigInteger tenThousand = new BigInteger("10000");
		BigInteger test = new BigInteger("19"); // start testing at 19
		while (true)
		{
			if (testEachNumber(test)) // test if the current num is a lychrelNumber
			{
				lychrelNumbers++;
			}
			test = test.add(BigInteger.ONE); // add one to the number being tested
			if (test.compareTo(tenThousand) == 0) // if the number being tested is over 10000 then break
			{
				break;
			}
		}
		System.out.println(lychrelNumbers);
	}
	
	public static boolean testEachNumber(BigInteger test)
	{
		int count = 1; // number of times goes through loop of testing
		while (true)
		{
			BigInteger sum = test.add(inverse(test)); 
			if (isPal(sum))
			{
				return false; // if it is a pal then return false (that it is not a lychrelNumber)
			}
			test = sum;
			count++;
			if (count > 49) 
			{
				return true; // if it does not catch a pal in 50 tries, return true (that it is a lychrelNumber)
			}
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
	
	private static boolean isPal(BigInteger sum)
	{
		BigInteger reverseSum = inverse(sum);
		if(sum.compareTo(reverseSum) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
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
