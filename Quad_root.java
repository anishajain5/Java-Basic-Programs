package cb_challenges_8_7_20;

import java.util.Scanner;

public class Quad_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
		int b=s.nextInt();
		int c= s.nextInt();
		
		int decide= b*b-(4*a*c);
		if(decide>0) {
			System.out.println("Real and Distinct");
			int r1= (int) ((-b+Math.sqrt(decide))/2*a);
			int r2=(int) ((-b-Math.sqrt(decide))/2*a);
			if(r1<r2) {
				System.out.println(r1+" "+r2);
			}
			else {
				System.out.println(r2+" "+r1);
			}
		}
		else if(decide==0) {
			System.out.println("Real and Equal");
			int r1= (int) ((-b+Math.sqrt(decide))/2*a);
			System.out.println(r1+" "+r1);
		}
		else {
			System.out.println("Imaginary");
		}

	}

}
