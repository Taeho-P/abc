package p9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int iScore = sc.nextInt();
//		
//		sc.close();
//		
//		if((iScore <= 100) && (iScore >= 90)) {
//			System.out.print("A");
//		} else if((iScore <= 89) && (iScore >= 80)) {
//			System.out.print("B");
//		} else if((iScore <= 79) && (iScore >= 70)) {
//			System.out.print("C");
//		} else if((iScore <= 69) && (iScore >= 60)) {
//			System.out.print("D");
//		} else {
//			System.out.print("F");
//		}
		
		int iScore2 = sc.nextInt();
		
		int a = iScore2/10;
		
		switch(a) {
		
		case  10 :
			System.out.println("A");
			break;
		case  9 :
			System.out.println("A");
			break;
		case  8 :
			System.out.println("B");
			break;
		case  7 :
			System.out.println("C");
			break;
		case  6 :
			System.out.println("D");
			break;
		default :
			System.out.println("F");
			break;
		}
		
		
	}

}
