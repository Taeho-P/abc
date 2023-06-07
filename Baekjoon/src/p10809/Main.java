package p10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sW = sc.next();

		sc.close();

		for (int i = 97; i < 123; i++) {
			int iA = -1;
			for (int j = 0; j < sW.length(); j++) {
				if (sW.charAt(j) == (char) i) {
					iA = j;
					break;
				}

			}
			System.out.print(iA + " ");
		}
	}

}
