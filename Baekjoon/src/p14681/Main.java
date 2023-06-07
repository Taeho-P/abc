package p14681;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iX = sc.nextInt();
		int iY = sc.nextInt();

		sc.close();

		if (iX > 0 && iY > 0) {
			System.out.println(1);
		} else if (iX < 0 && iY > 0) {
			System.out.println(2);
		} else if (iX < 0 && iY < 0) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}

	}

}
