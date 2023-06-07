package p10810;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iB = sc.nextInt();
		int iC = sc.nextInt();

		int[] iBas = new int[iB];

		for (int i = 0; i < iC; i++) {
			int iBs = sc.nextInt();
			int iBe = sc.nextInt();
			int iBn = sc.nextInt();
			for (int j = iBs - 1; j <= iBe - 1; j++) {
				iBas[j] = iBn;
			}
		}
		sc.close();

		for (int i = 0; i < iBas.length; i++) {
			System.out.print(iBas[i] + " ");
		}
	}

}
