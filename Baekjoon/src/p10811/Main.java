package p10811;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iB = sc.nextInt();
		int iC = sc.nextInt();

		int[] iBs = new int[iB];

		for (int i = 0; i < iBs.length; i++) {
			iBs[i] = i + 1;
		}
		for (int i = 0; i < iC; i++) {
			int iS = sc.nextInt();
			int iE = sc.nextInt();
			for (int j = 0; j < (iE - iS + 1) / 2; j++) {
				int iBox = iBs[iS - 1 + j];
				iBs[iS - 1 + j] = iBs[iE - 1 - j];
				iBs[iE - 1 - j] = iBox;
			}
		}

		sc.close();

		for (int i = 0; i < iBs.length; i++) {
			System.out.print(iBs[i] + " ");
		}

	}

}
