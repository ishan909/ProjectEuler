package euler;

import java.math.BigInteger;

public class Question025
{
	public static void main(String[] args)
	{
		
		BigInteger minusTwo = BigInteger.ONE;
		BigInteger minusOne = BigInteger.ONE;
		BigInteger current = minusTwo.add(minusOne);
		BigInteger term = new BigInteger("2");
		do
		{
			current = minusTwo.add(minusOne);
			minusTwo = minusOne;
			minusOne = current;
			term = term.add(BigInteger.ONE);
		}
		while (getBigDigits(current) < 1000);
		System.out.println(term);
		
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
