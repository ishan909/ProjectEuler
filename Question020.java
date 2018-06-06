package euler;

import java.math.BigInteger;

public class Question020
{
	// See Question 16
	public static void main(String[] args)
	{
		BigInteger fact = BigInteger.ONE;
		for (int i = 100; i > 1; i--)
		{
			String num = Integer.toString(i);
			fact = fact.multiply(new BigInteger(num));
		}
		System.out.println(fact);
		
		
		BigInteger sum = new BigInteger("0");
		while (fact.compareTo(BigInteger.ZERO) == 1)
		{
			sum = sum.add(fact.remainder(BigInteger.TEN));
			fact = fact.divide(BigInteger.TEN);
		}
		System.out.println("Sum: " + sum.toString());
	}
}
