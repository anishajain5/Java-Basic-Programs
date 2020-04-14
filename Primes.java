import java.util.Scanner;

public class Primes {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int divisor = 2;
		while (divisor <= x - 1) {
			if (x % divisor == 0) {
				System.out.println("Not prime");
				return;
			}
			divisor++;
		}
		System.out.println("Prime");
	}
}
