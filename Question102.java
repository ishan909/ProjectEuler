package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question102
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("p102_triangles.txt"));
		int count = 0;
		
		while (input.hasNext())
		{
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			int x3 = input.nextInt();
			int y3 = input.nextInt();
			
			double targetArea = area(x1, y1, x2, y2, x3, y3);
			double area1 = area(0, 0, x2, y2, x3, y3);
			double area2 = area(x1, y1, 0, 0, x3, y3);
			double area3 = area(x1, y1, x2, y2, 0, 0);
			
			if (targetArea == area1 + area2 + area3)
			{
				count++;
			}
		}
		
		System.out.println(count);
		input.close();
	}
	
	private static double area(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		return Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
	}
}
