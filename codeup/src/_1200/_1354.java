package _1200;

import java.util.Scanner;

public class _1354 {

	public static void main(String[] args) {
//		길이 n이 입력되면 역삼각형을 출력한다.
//		예)
//		n이 5이면
//		*****
//		****
//		***
//		**
//		*
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for (int i = n; i > 0; i--) {
			for (int j = i; j >0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
