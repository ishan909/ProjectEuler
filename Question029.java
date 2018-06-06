package euler;

import java.math.BigInteger;
import java.util.ArrayList;

public class Question029
{
	public static void main(String[] args)
	{
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		for (BigInteger a = new BigInteger("2"); a.compareTo(new BigInteger("101")) < 0; a = a.add(BigInteger.ONE))
		{
			for (int b = 2; b < 101; b++)
			{
				BigInteger product = a.pow(b);
				if (!list.contains(product))
				{
					list.add(product);
				}
			}
		}
		System.out.println(list.size());
		System.out.println(new java.util.Date());
	}
}
