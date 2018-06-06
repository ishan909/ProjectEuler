package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Question099
{
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println(new java.util.Date());
		Scanner input = new Scanner(new File("p099_base_exp.txt"));
		BigInteger largest = BigInteger.ONE;
		int count = 1;
		int largestLine = 0;
		do
		{
			BigInteger base = new BigInteger(Integer.toString(input.nextInt()));
			BigInteger total = base.pow(input.nextInt());
			System.out.println(count);
			if (total.compareTo(largest) == 1)
			{
				largest = total;
				largestLine = count;
			}
			count++;
		}
		while (input.hasNext());
		input.close();
		System.out.println(largestLine);
		System.out.println(new java.util.Date());
	}
}