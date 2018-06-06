package euler;

public class Question043 {

	// d2d3d4=406 is divisible by 2
	// d3d4d5=063 is divisible by 3
	// d4d5d6=635 is divisible by 5
	// d5d6d7=357 is divisible by 7
	// d6d7d8=572 is divisible by 11
	// d7d8d9=728 is divisible by 13
	// d8d9d10=289 is divisible by 17

	public static void main(String[] args) {
		long sum = 0;
		// 1406357289
		for (long i = 123456789l; i < 9999999999l; i++) {
			if (i % 500000000l == 0)
				System.out.println(i + " " + new java.util.Date());
			if (getDigits(i) > 9) {
				if (isPan(i)) {
					String s = Long.toString(i);
					if (Long.valueOf(s.substring(7, 10)) % 17 == 0) {
						if (Long.valueOf(s.substring(6, 9)) % 13 == 0) {
							if (Long.valueOf(s.substring(5, 8)) % 11 == 0) {
								if (Long.valueOf(s.substring(4, 7)) % 7 == 0) {
									if (Long.valueOf(s.substring(3, 6)) % 5 == 0) {
										if (Long.valueOf(s.substring(2, 5)) % 3 == 0) {
											if (Long.valueOf(s.substring(1, 4)) % 2 == 0) {
												sum += i;
											}
										}
									}
								}
							}
						}
					}
				}
			} else {
				if (isPan(i)) {
					String s = Long.toString(i);
					if (Integer.valueOf(s.substring(6, 9)) % 17 == 0) {
						if (Integer.valueOf(s.substring(5, 8)) % 13 == 0) {
							if (Integer.valueOf(s.substring(4, 7)) % 11 == 0) {
								if (Integer.valueOf(s.substring(3, 6)) % 7 == 0) {
									if (Integer.valueOf(s.substring(2, 5)) % 5 == 0) {
										if (Integer.valueOf(s.substring(1, 4)) % 3 == 0) {
											if (Integer.valueOf(s.substring(0, 3)) % 2 == 0) {
												sum += i;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("ANS: " + sum + " " + new java.util.Date());
	}

	private static boolean isPan(long num) {
		boolean[] test = new boolean[10];

		while (num >= 0) {
			int temp = (int) (num % 10);
			if (test[temp])
				break;

			test[temp] = true;
			num /= 10;
		}

		if (getDigits(num) < 10) {
			test[0] = true;
		}

		for (int i = 0; i < test.length; i++) {
			if (!test[i])
				return false;
		}
		return true;
	}

	private static int getDigits(long n) {
		int dig = 0;
		while (n > 0) {
			n /= 10;
			dig++;
		}
		return dig;
	}
}
