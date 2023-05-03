package p2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int iA = sc.nextInt();
		int iB = sc.nextInt();
		
		int iB1 = iB/100;
		int iB2 = (iB - (iB1*100))/10;
		int iB3 = iB-(iB1 * 100 + iB2 * 10);
		
		int iX = iA * iB3;
		int iY = iA * iB2;
		int iZ = iA * iB1;
		
		sc.close();
		
		System.out.println(iX);
		System.out.println(iY);
		System.out.println(iZ);
		System.out.println(iA * iB);
	}

}
