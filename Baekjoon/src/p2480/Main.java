package p2480;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum1 = sc.nextInt();
		int iNum2 = sc.nextInt();
		int iNum3 = sc.nextInt();

		sc.close();

		if (iNum1 == iNum2 && iNum2 == iNum3) {
			System.out.println(10000 + iNum1 * 1000);
		} else if (iNum1 == iNum2 || iNum1 == iNum3 || iNum2 == iNum3) {
			if (iNum1 == iNum2 || iNum1 == iNum3) {
				System.out.println(1000 + iNum1 * 100);
			} else {
				System.out.println(1000 + iNum2 * 100);
			}
		} else {
			if (iNum1 < iNum2) {
				if (iNum2 < iNum3) {
					System.out.println(iNum3 * 100);
				} else {
					System.out.println(iNum2 * 100);
				}
			} else if (iNum1 < iNum3) {
				System.out.println(iNum3 * 100);
			} else {
				System.out.println(iNum1 * 100);
			}
		}

	}

}
