package euler;

import java.math.BigInteger;

public class Question063
{
	public static void main(String[] args)
	{
		int count = 0;
		
		for (int pow = 1; true; pow++)
		{
			for (BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.TEN) < 0; i = i.add(BigInteger.ONE))
			{
				BigInteger ex = i.pow(pow);
				if (getDigits(ex) == pow)
				{
					count++;
					System.out.println(count);
				}
			}
		}
	}
	
	private static int getDigits(BigInteger power)
	{
		int dig = 0;
		while (power.compareTo(BigInteger.ZERO) > 0)
		{
		power = power.divide(BigInteger.TEN);
			dig++;
		}
		return dig;
	}
}