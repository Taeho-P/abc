package p5597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] iSn = new int[28];
		int[] iC = new int[30];

		for (int i = 0, j = 1; i < iC.length; i++, j++) {
			iC[i] = j;
		}

		for (int i = 0; i < iSn.length; i++) {
			iSn[i] = sc.nextInt();
			for (int j = 0; j < iC.length; j++) {
				if (iSn[i] == iC[j]) {
					iC[j] = 0;
				}
			}
		}

		sc.close();

		for (int i = 0; i < iC.length; i++) {
			if (iC[i] != 0) {
				System.out.println(iC[i]);
			}

		}
	}
}
