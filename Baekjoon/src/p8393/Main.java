package p8393;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iN = sc.nextInt();
		int iSum = 0;
		for (int i = 1; i <= iN; i++) {
			iSum += i;
		}
		sc.close();
		System.out.println(iSum);

	}

}
