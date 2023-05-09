package p2753;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iY = sc.nextInt();

		sc.close();

		int iY4 = iY % 4;

		int iY100 = iY % 100;

		int iY400 = iY % 400;

		if (iY4 == 0 && !(iY100 == 0) || iY400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
