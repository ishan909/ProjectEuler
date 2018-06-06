package euler;

public class Question092
{
	public static void main(String[] args)
	{
		int count = 0;
		for (int i = 2; i < 10000000; i++)
		{
			int step = i;
			while (step != 1 && step != 89)
				step = decompose(step);
			if (step == 89)
				count++;
		}
		System.out.println("Total Count: " + count);
		System.out.println(new java.util.Date());
	}

	private static int decompose(int i)
	{
		String number = Integer.toString(i);
		int newNumber = 0;
		for (int j = 0; j < number.length(); j++)
			newNumber += Math.pow(Integer.parseInt(number.substring(j, j + 1)), 2);
		return newNumber;
	}
}
