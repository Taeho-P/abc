package p2440_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int iS = sc.nextInt();
		for(int i = 0; i < iS; i++) {
			for(int j = 0; j < iS - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
