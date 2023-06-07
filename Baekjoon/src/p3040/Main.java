package p3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] iNums = new int[9];
		int iSum = 0;
		for (int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();
			iSum += iNums[i];
		}

		sc.close();

		int iA = iSum - 100;

		int iA1 = 0;
		int iA2 = 0;

		for (int i = 0; i < iNums.length; i++) {
			int iB1 = iA - iNums[i];
			for (int j = 0; j < iNums.length; j++) {
				int iB2 = iB1;
				if (i != j) {
					iB2 -= iNums[j];
				} else {
					continue;
				}
				if (iB2 == 0) {
					iA1 = i;
					iA2 = j;
				}
			}
		}
		for (int i = 0; i < iNums.length; i++) {
			if (i != iA1 && i != iA2) {
				System.out.println(iNums[i]);
			}
		}
	}
}
