package cb_challenges_8_7_20;

import java.util.Scanner;

public class Boston_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int num=n;
		int s1=0;
		int s2=0;
		while(num>0) {
			int rem=num%10;
			s1+=rem;
			num/=10;
		}
		//System.out.println(s1);
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
				int x=i;
				int sum=0;
				if(n%i==0) {
					while(x>0) {
						int rem=x%10;
						sum+=rem;
						x/=10;	
					}
				}
				while(n%i==0) {
					s2+=sum;
					n/=i;
				}
			}
		}
		//System.out.println(s2);
		if(s1==s2) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}

	}

}
