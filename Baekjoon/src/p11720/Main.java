package p11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iN = sc.nextInt();
		String sNums = sc.next();
		int iSum = 0;

		sc.close();

		for (int i = 0; i < iN; i++) {
			iSum += Character.getNumericValue(sNums.charAt(i));
		}
		System.out.println(iSum);
	}

}
