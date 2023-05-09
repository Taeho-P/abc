package p10807;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iC = sc.nextInt();

		int[] iNums = new int[iC];

		for (int i = 0; i < iC; i++) {
			iNums[i] = sc.nextInt();
		}

		int iNum = sc.nextInt();
		int iNumc = 0;

		sc.close();

		for (int i2 = 0; i2 < iC; i2++) {
			if (iNums[i2] == iNum) {
				iNumc++;
			}
		}
		System.out.println(iNumc);
	}

}
