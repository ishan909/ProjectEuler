import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Question042 {
	public static HashSet<Integer> triangleNumbers;
	public static int maxN; // stores the highest index in the HashSet
	public static int maxNum; // stores the highest triangle number in the HashSet
	
	public static void main(String[] args) throws FileNotFoundException {
		triangleNumbers = new HashSet<Integer>();
		maxN = 0;
		maxNum = 0;
		generate();
		
		// NOTE: I have parsed the input file to remove all quotation marks and commas before using it
		Scanner in = new Scanner(new File("p042_words.txt"));
		int count = 0;
		while (in.hasNext()) {
			int sum = 0;
			String word = in.next();
			for (char c : word.toCharArray()) { // find the integer value of each word
				sum += c - 64;
			}
			if (sum > maxNum) { // expand the HashSet if it is not big enough
				expandSet();
			}
			if (triangleNumbers.contains(sum)) {
				count++;
			}
		}
		System.out.println(count + " words are triangle words for this text file.");
		in.close();
	}
	
	/*
	 * Fills the HashSet with the first 9 triangle numbers
	 */
	public static void generate() {
		for (int n = 1; n < 10; n++) {
			triangleNumbers.add(n * (n + 1) / 2);
		}
		maxN = 9;
		maxNum = maxN * (maxN + 1) / 2;
	}
	
	/*
	 * Fills the HashSet if it is not contain enough values
	 * Expands the size to 2x its current size
	 */
	public static void expandSet() {
		for (int n = maxN + 1; n < (maxN + 1) * 2; n++) {
			triangleNumbers.add(n * (n + 1) / 2);
		}
		maxN = (maxN + 1) * 2 - 1;
		maxNum = maxN * (maxN + 1) / 2;
	}
}
