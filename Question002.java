package euler;

public class Question002 {

	public static void main(String[] args)
	{
		int[] seq = new int[4000000];
		seq[0] = 1;
		seq[1] = 2;
		int sum = 2;
		for (int i = 2; i < seq.length; i++)
		{
			seq[i] = seq[i - 2] + seq[i - 1];
			if (seq[i] % 2 == 0)
			{
				sum += seq[i];
			}
			if (seq[i] > 4000000)
			{
				break;
			}
		}
		System.out.println(sum);
		
	}

}
