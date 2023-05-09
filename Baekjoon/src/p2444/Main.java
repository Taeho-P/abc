package p2444;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iC = sc.nextInt();

		int iSc1 = 1;

		int iSc2 = iC;

		sc.close();

		for (int i = iC - 1; i > 0; i--) {
			// 공백찍기
			for (int j = i; j > 0; j--) {
				System.out.print(" ");
			}
			// 별찍기
			for (int j = iSc1 * 2 - 1; j > 0; j--) {
				System.out.print("*");
			}
			iSc1++;
			System.out.println();
		}

		for (int i = iC; i > 0; i--) {
			// 공백찍기
			for (int j = iC - i; j > 0; j--) {
				System.out.print(" ");
			}
			// 별찍기
			for (int j = iSc2 * 2 - 1; j > 0; j--) {
				System.out.print("*");
			}
			iSc2--;
			System.out.println();
		}

	}

}
