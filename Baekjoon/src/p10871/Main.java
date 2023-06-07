package p10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iN = sc.nextInt();
		int iX = sc.nextInt();

		int[] iNums = new int[iN];

		for (int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();

			if (iNums[i] < iX) {
				System.out.print(iNums[i] + " ");
			}
		}
		sc.close();
	}

}
