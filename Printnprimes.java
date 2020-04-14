package challenge1;

import java.util.Scanner;

public class Printnprimes {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n == 0 || n == 1) {
			System.out.println("No primes");
		} else {
			System.out.println("2");
			for (int i = 3; i <= n; i++) {
				int j = 2;
				int flag = 0;
				while (j < i) {
					if (i % j == 0) {
						flag = 1;
					}
					j++;

				}
				if (flag != 1) {
					System.out.println(i);
				}
			}
		}
	}
}