package challenge1;

import java.util.Scanner;

public class LCM {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int lcm = 0;
		if (a > b) {
			lcm = a;
		} else {
			lcm = b;
		}
		while (true) {
			if (lcm % a == 0 & lcm % b == 0) {
				System.out.println(lcm);
				break;
			}
			++lcm;
		}

	}
}