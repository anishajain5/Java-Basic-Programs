package challenge1;

import java.util.Scanner;

public class Sum_odd_even_digits {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int even = 0;
		int odd = 0;
		int rem = 0;
		int i = 1;
		while (n != 0) {
			rem = n % 10;
			if (i % 2 == 0) {
				even += rem;
			} else {
				odd += rem;
			}
			i++;
			n = n / 10;
		}
		System.out.println(odd);
		System.out.println(even);

	}
}