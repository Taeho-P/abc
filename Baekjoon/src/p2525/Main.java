package p2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iT = sc.nextInt();
		int iM = sc.nextInt();
		int iC = sc.nextInt();

		sc.close();

		int iCt = (iM + iC) / 60;
		int iT23 = -1;

		if (iT == 23 && iM + iC > 59) {
			System.out.printf("%d %d", iT23 + iCt, iM + iC - 60 * iCt);
		} else if (iM + iC > 59 && iCt + iT > 23) {
			System.out.printf("%d %d", iT + iCt - 24, iM + iC - 60 * iCt);
		} else if (iM + iC > 59) {
			System.out.printf("%d %d", iT + iCt, iM + iC - 60 * iCt);
		} else {
			System.out.printf("%d %d", iT, iM + iC);
		}

	}

}
