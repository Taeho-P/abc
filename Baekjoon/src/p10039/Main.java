package p10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] iS = new int[5];

		int iSum = 0;

		for (int i = 0; i < iS.length; i++) {
			int iA = sc.nextInt();
			iA = iA >= 40 ? iA : 40;
			iS[i] = iA;
			iSum += iS[i];
		}

		sc.close();

		System.out.println(iSum / iS.length);

	}

}
