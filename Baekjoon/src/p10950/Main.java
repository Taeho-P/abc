package p10950;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int iT = sc.nextInt();
		
		for (int i = 0; i < iT; i++) {
			int iA = sc.nextInt();
			int iB = sc.nextInt();
			
			System.out.println(iA + iB);
		}
		sc.close();

	}

}
