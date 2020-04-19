package challenge1;

import java.util.Scanner;

public class Shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a = 0, h = 0;
		while (t != 0) {
			a = s.nextInt();
			h = s.nextInt();

			int n = 1;
			while (a > 0 && h > 0) {
				a -= n;
				n++;
				h -= n;
				n++;
			}

			if (a > 0) {
				System.out.println("Aayush");
			} else {
				System.out.println("Harshit");
			}
			t--;
		}

	}

}
