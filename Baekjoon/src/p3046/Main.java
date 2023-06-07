package p3046;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iR1 = sc.nextInt();
		int iS = sc.nextInt();

		sc.close();

		int iR2 = iS * 2 - iR1;

		System.out.println(iR2);

	}

}
