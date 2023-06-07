package p11021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iC = sc.nextInt();

		for (int i = 1; i <= iC; i++) {
			int iA = sc.nextInt();
			int iB = sc.nextInt();

			System.out.println("Case #" + i + ": " + (iA + iB));
		}
		sc.close();

	}

}
