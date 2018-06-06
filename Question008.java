package euler;

public class Question008
{
	// TODO Incomplete
	public static void main(String[] args)
	{
//		Scanner file = new Scanner(new File("q8b.txt"));
//		
//		int nums = 1000;
//		int[][] list = new int[nums / 50][nums / 20];
//		for (int rows = 0; rows < list.length; rows++) {
//			for (int cols = 0; cols < list[0].length; cols++) {
//				list[rows][cols] = file.nextInt();
//			} 
//		}
		
		// **NOTE: My code wasn't working so this is pretty much a copy of Alex's**
		String rows = "73167176531330624919225119674426574742355349194934" +
				"96983520312774506326239578318016984801869478851843" +
				"85861560789112949495459501737958331952853208805511" +
				"12540698747158523863050715693290963295227443043557" +
				"66896648950445244523161731856403098711121722383113" +
				"62229893423380308135336276614282806444486645238749" +
				"30358907296290491560440772390713810515859307960866" +
				"70172427121883998797908792274921901699720888093776" +
				"65727333001053367881220235421809751254540594752243" +
				"52584907711670556013604839586446706324415722155397" +
				"53697817977846174064955149290862569321978468622482" +
				"83972241375657056057490261407972968652414535100474" +
				"82166370484403199890008895243450658541227588666881" +
				"16427171479924442928230863465674813919123162824586" +
				"17866458359124566529476545682848912883142607690042" +
				"24219022671055626321111109370544217506941658960408" +
				"07198403850962455444362981230987879927244284909188" +
				"84580156166097919133875499200524063689912560717606" +
				"05886116467109405077541002256983155200055935729725" +
				"71636269561882670428252483600823257530420752963450";
		
		long largestProduct = 1l;
		for (int start = 0; start < rows.length() - 12; start++)
		{
			String thirteen = rows.substring(start, start + 13);
			long product = 1l;
			for (int n = 0; n < 13; n++)
			{
				int singleNum = Integer.parseInt(thirteen.substring(0, 1));
				product *= singleNum;
				thirteen = thirteen.substring(1);
			}
			
			if (product > largestProduct)
			{
				largestProduct = product;
			}
		}
		System.out.println(largestProduct);
		
//		long max = 0l;
//		for (int row = 0; row < list.length; row++)
//		{
//			for (int col = 0; col < list[row].length - 12; col++)
//			{
//				long product = list[row][col] * list[row][col + 1] * list[row][col + 2] * list[row][col + 3] * list[row][col + 4] * list[row][col + 5] * list[row][col + 6] * list[row][col + 7] * list[row][col + 8] * list[row][col + 8] * list[row][col + 10] * list[row][col + 11] * list[row][col + 12];
//				if (product > max)
//				{
//					max = product * 3;
//				}
//			}
//		}
//		System.out.println(max);
//		file.close();
	}
}
