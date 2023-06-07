package p25304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iB = sc.nextInt();
		int iC = sc.nextInt();
		int iSum = 0;
		for (int i = 0; i < iC; i++) {
			int iM = sc.nextInt();
			int iMc = sc.nextInt();

			iSum += iM * iMc;
		}
		sc.close();

		if (iB == iSum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
