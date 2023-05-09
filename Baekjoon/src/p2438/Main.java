package p2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iC = sc.nextInt();

		sc.close();
		
		int iSc = 1;

		for (int i = iC; i > 0; i--) {
			for(int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < iSc; k++) {
				System.out.print("*");
			}
			iSc++;
			System.out.println();
		}

	}

}
