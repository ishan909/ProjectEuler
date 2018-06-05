package euler;

public class Question006
{
	public static void main(String[] args)
	{
		int max = 100;
		
		int sumTermSqr = 0;
		for (int i = 1; i <= max; i++)
		{
			sumTermSqr += i * i;
		}
		System.out.println(sumTermSqr);

		int sumDigits = 0;
		for (int i = 1; i <= max; i++)
		{
			sumDigits += i;
		}
		int sumDigitsSrq = sumDigits * sumDigits;
		System.out.println(sumDigitsSrq);
		
		int difference = sumDigitsSrq - sumTermSqr;
		System.out.println(difference);
	}

}
