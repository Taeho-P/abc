package p2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int iT = sc.nextInt();
		for(int i = 0; i < iT; i++) {
			int iC = sc.nextInt();
			String sS = sc.next();
			for(int j = 0; j < sS.length(); j++) {
				for(int k = 0; k < iC; k++) {
					System.out.print(sS.charAt(j));
				}
			}System.out.println();
		}
		sc.close();

	}

}
