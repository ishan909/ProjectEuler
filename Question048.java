package euler;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Question048
{
	public static void main(String[] args) throws FileNotFoundException
	{
		BigInteger i = BigInteger.ONE; // current num and power
		BigInteger oneThousand = new BigInteger("1001"); // max
		BigInteger sum = BigInteger.ZERO; // sum
		while (i.compareTo(oneThousand) == -1) // while current num and power < 1001
		{
			BigInteger count = BigInteger.ZERO;
			BigInteger term = BigInteger.ONE;
			while (count.compareTo(i) == -1)
			{
				term = term.multiply(i);
				count = count.add(BigInteger.ONE);	
			}
			sum = sum.add(term);
			i = i.add(BigInteger.ONE);
			//System.out.println(i);
		}
		PrintWriter output = new PrintWriter("Question048.txt");
		System.out.println(sum);
		output.print(sum);
		output.close();
	}
}
