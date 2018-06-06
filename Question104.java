package euler;

import java.math.BigInteger;
import java.util.ArrayList;

public class Question104
{
	public static void main(String[] args)
	{
		// SAMPLE PAN NUM: 283947156
		
		ArrayList<BigInteger> fibNums = new ArrayList<BigInteger>();
		fibNums.add(BigInteger.ZERO);
		fibNums.add(BigInteger.ONE);
		
		int count = 2;
		int i = 2; 
		 
		while (count < 45)
		{
			BigInteger fib = fibNums.get(i - 1).add(fibNums.get(i - 2));
			fibNums.add(fib);
			fibNums.remove(0);
			count++;
		} 
		
		while (true)
		{
			BigInteger fib = fibNums.get(i - 1).add(fibNums.get(i - 2));
			if (isPanEnd(fib) && isPanStart(fib))
			{
				System.out.println("ANSWER: " + count);
				System.out.println(new java.util.Date());
				break;
			}
			fibNums.add(fib);
			fibNums.remove(0);
			
			if (count % 1000 == 0)
				System.out.println(count + " " + new java.util.Date());
			
			count++;
		}
	}
	
	private static boolean isPanEnd(BigInteger fibNum)
	{
		BigInteger end = fibNum.remainder(new BigInteger("1000000000"));
		
		boolean[] test = new boolean[10];
		
		while (end.compareTo(BigInteger.ONE) >= 0)
		{
			BigInteger temp = end.remainder(BigInteger.TEN);
			if (test[temp.intValue()])
				break;
			
			test[temp.intValue()] = true;
			end = end.divide(BigInteger.TEN);
		}
		
		for (int i = 1; i < test.length; i++)
		{
			if (!test[i])
				return false;
		}
		return true;
		
	}

	private static boolean isPanStart(BigInteger fibNum) 
	{
		int divisor = getDigits(fibNum) - 9;
		BigInteger start = fibNum.divide(BigInteger.TEN.pow(divisor));
		
		boolean[] test = new boolean[10];
		
		while (start.compareTo(BigInteger.ONE) >= 0)
		{
			BigInteger temp = start.remainder(BigInteger.TEN);
			if (test[temp.intValue()])
				break;
			
			test[temp.intValue()] = true;
			start = start.divide(BigInteger.TEN);
		}
		
		for (int i = 1; i < test.length; i++)
		{
			if (!test[i])
				return false;
		}
		return true;
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
