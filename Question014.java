package euler;

public class Question014
{
	public static void main(String[] args)
	{
		long largestTerm = 0;
		long largestStartingNumber = 0;
		
		for (long startingNumber = 2; startingNumber < 1000000; startingNumber++) // i is the starting number
		{			

			long n = startingNumber; // n can be manipulated
			long terms = 1;
			
			while (n > 1)
			{
				if (n % 2 == 0)
				{
					n /= 2;
					terms++;
				}
				else
				{
					n = 3 * n + 1;
					terms++;
				}
			}

			if (terms > largestTerm)
			{
				largestTerm = terms;
				largestStartingNumber = startingNumber;
			}
		}
		System.out.println("terms: " + largestTerm + "\tstarting number: " + largestStartingNumber);
	}
}
