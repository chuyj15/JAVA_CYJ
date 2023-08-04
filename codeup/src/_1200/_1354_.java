package _1200;

import java.util.Scanner;

public class _1354_ {

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
		
		//i:1, j:5 4 3 2 1
		//i:2, j:5 4 3 2
		//i:3, j:5 4 3
		//i:4, j:5 4
		//i:4, j:5
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
