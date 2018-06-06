package euler;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Question080
{
	public static void main(String[] args)
	{
		long sum = 0;
		int firstXNumbers = 100;
		for (int i = 1; i < firstXNumbers + 1; i++)
		{
			BigDecimal number = sqrt(i, 100);
			sum += sumOfDigits(number);
			System.out.println(number);
			System.out.println(sum);
		}
		int subtractPerfectSquaresUpTo = (int) Math.sqrt(firstXNumbers);
		while (subtractPerfectSquaresUpTo > 0)
		{
			sum -= subtractPerfectSquaresUpTo;
			subtractPerfectSquaresUpTo--;
		}
		System.out.println(sum);
	}
	
	private static int sumOfDigits(BigDecimal number)
	{
		int sum = 0;
		for (int i = 0; i < 100; i++)
		{
			sum += number.intValue();
			number = number.subtract(new BigDecimal(String.valueOf(number.intValue())));
			number = number.multiply(BigDecimal.TEN);
		}
		return sum;
	}
	
	public static BigDecimal sqrt(int inInt, int scale)
	{
	    BigDecimal in = new BigDecimal(String.valueOf(inInt));
		BigDecimal sqrt = new BigDecimal(1);
	    sqrt.setScale(scale + 3, RoundingMode.FLOOR);
	    BigDecimal store = new BigDecimal(in.toString());
	    boolean first = true;
	    do
	    {
	        if (!first)
	        {
	            store = new BigDecimal(sqrt.toString());
	        }
	        else first = false;
	        store.setScale(scale + 3, RoundingMode.FLOOR);
	        sqrt = in.divide(store, scale + 3, RoundingMode.FLOOR).add(store).divide(
	                BigDecimal.valueOf(2), scale + 3, RoundingMode.FLOOR);
	    }
	    while (!store.equals(sqrt));
	    return sqrt.setScale(scale, RoundingMode.FLOOR);
	}
}
