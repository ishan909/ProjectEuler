package euler;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Question097
{
	public static void main(String[] args) throws FileNotFoundException
	{
		BigInteger total = BigInteger.ZERO;
		BigInteger TWO = new BigInteger("2");
		total = TWO.pow(7830457);
		BigInteger coeff = new BigInteger("28433");
		total = total.multiply(coeff);
		total = total.add(BigInteger.ONE);
		System.out.println(total);
		PrintWriter output = new PrintWriter("Question097.txt");
		output.print(total);
		output.close();
	}
}
