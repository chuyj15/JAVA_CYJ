package _1200;

import java.util.Scanner;

public class _1353 {
	public static void main(String[] args) {
//		
//		n이 입력되면 다음과 같은 삼각형을 출력하시오.
		
//		예)
//		n 이 5 이면
//		*
//		**
//		***
//		****
//		*****
//		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= i; j++) {
				String str = "*";
				System.out.print(str);
			}
			System.out.println();
		}
		sc.close();
		
		
	}
}
