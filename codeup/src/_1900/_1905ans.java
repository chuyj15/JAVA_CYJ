package _1900;

import java.util.Scanner;

public class _1905ans {
	static int sum;
	
	//종료조건
	//재귀호출
	public static int method(int n) {
		if (n==0) return 0;
		return n + method(n-1);		//재귀함수랑 똑같넹
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int result = method(n);
		System.out.println(result);
		
		
		sc.close();
	}
}
