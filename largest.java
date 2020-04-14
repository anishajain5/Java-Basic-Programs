package lecture_1;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		int c = 10;
		if (a > b && a > c)
			System.out.println("A is largest");
//		else {
//			if (b > c && b > a)
//				System.out.println("B is largest");
//			else
//				System.out.println("C is largest");	}
		else if (b > c && b > a)
			System.out.println(" B is largest");

		else
			System.out.println("C is largest");

	}

}
