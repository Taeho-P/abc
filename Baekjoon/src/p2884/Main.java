package p2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iH = sc.nextInt();
		int iM = sc.nextInt();

		sc.close();

		if (iH == 0 && iM < 45) {
			iH = iH + 23;
			iM = 60 - (45 - iM);
		} else if (iM < 45) {
			iH = iH - 1;
			iM = 60 - (45 - iM);
		} else {
			iM = iM - 45;
		}
		System.out.printf("%d %d\n", iH, iM);
		
		int num = 5;
		num = num++;
		System.out.print(num);
		
	}

}
