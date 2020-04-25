package lecture_9;

public class Seive_of_Erostosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
		soe(n);

	}

	public static void soe(int n) {
		boolean[] primes = new boolean[n + 1];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}
		int n2test = 2;
		while (n2test * n2test <= n) {
			if (primes[n2test] == true) {
				for (int multiplier = 2; n2test * multiplier <= n; multiplier++) {
					primes[n2test * multiplier] = false;
				}
			}
			n2test++;
		}
		for (int i = 2; i < primes.length; i++) {
			if (primes[i] == true) {
				System.out.println(i);
			}
		}
	}

}
