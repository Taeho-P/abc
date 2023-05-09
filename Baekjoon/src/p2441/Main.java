package p2441;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iC = sc.nextInt();

		sc.close();

		for (int i = iC; i > 0; i--) {
			// 공백찍기
			for (int j = 0; j < (iC - i); j++) {
				System.out.print(" ");
			}
			// 별찍기
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
