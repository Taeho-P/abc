package p10430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int iA = sc.nextInt();
		int iB = sc.nextInt();
		int iC = sc.nextInt();
		
		sc.close();
		
		System.out.println((iA+iB)%iC);
		System.out.println(((iA%iC) + (iB%iC))%iC);
		System.out.println((iA * iB)%iC);
		System.out.print(((iA%iC) * (iB%iC))%iC);

	}

}
