package p2442;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iC = sc.nextInt();

		int iS = 0;

		sc.close();

		for (int i = iC; i > 0; i--) {
			iS++;
			// 공백찍기
			for (int j = i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			// 별찍기
			for (int j = 0; j < iS * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
