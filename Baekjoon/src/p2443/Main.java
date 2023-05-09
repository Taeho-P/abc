package p2443;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iC = sc.nextInt();

		int iSc = iC;
		sc.close();

		for (int i = 0; i < iC; i++) {
			// 공백찍기
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// 별찍기
			for (int j = iSc * 2 - 1; j >= 1; j--) {
				System.out.print("*");
			}
			iSc--;
			System.out.println();

		}

	}

}
