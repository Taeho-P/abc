package p10813;

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
			int iBox = 0;
			int iB1 = sc.nextInt() - 1;
			int iB2 = sc.nextInt() - 1;
			iBox = iBs[iB1];
			iBs[iB1] = iBs[iB2];
			iBs[iB2] = iBox;
		}

		sc.close();

		for (int i = 0; i < iBs.length; i++) {
			System.out.print(iBs[i] + " ");
		}

	}

}
