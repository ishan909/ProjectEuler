package euler;

import java.math.BigInteger;

public class Question016
{
	public static void main(String[] args)
	{
		//long power = (long)Math.pow(2, 1000);
		BigInteger power = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		for (int i = 0; i < 1000; i++)
		{
			power = power.multiply(two);
		}
		System.out.println("Number: " + power);

		int length = getDigits(power);
		System.out.println("Chars: " + length);
		
		BigInteger sum = new BigInteger("0");
		while (power.compareTo(BigInteger.ZERO) == 1)
		{
			sum = sum.add(power.remainder(BigInteger.TEN));
			power = power.divide(BigInteger.TEN);
		}
		System.out.println("Sum: " + sum.toString());
		
		/*
		String powerStr = Long.toString(power);
		int sum = 0;
		for (int i = 0; i < length; i++)
		{
			sum += Integer.parseInt(power.substring(i, i + 1));
		}
		System.out.println(sum);
		*/
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
