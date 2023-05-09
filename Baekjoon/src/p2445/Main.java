package p2445;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iC = sc.nextInt();

		sc.close();

		for (int i = 1; i <= iC; i++) {
			// 별찍기
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			// 공백찍기
			for (int j = (iC - i) * 2; j > 0; j--) {
				System.out.print(" ");
			}
			// 별찍기
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i < iC; i++) {
			// 별찍기
			for (int j = iC - i; j > 0; j--) {
				System.out.print("*");
			}
			// 공백찍기
			for (int j = i * 2; j > 0; j--) {
				System.out.print(" ");
			}
			// 별찍기
			for (int j = iC - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
