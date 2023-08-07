package _1900;

import java.util.Scanner;

//1부터 정수 n까지 출력하는 재귀함수를 설계하시오.

public class _1901ans {
		
	//강사님이 쓴 답
	public static void method(int n) {
		if (n==0) return;
		// n = n - 1; 아래 --n은 이거랑 같은 거임. 따라서 syso할 때는 n+1을 해준 거임.~!
		method(--n);	
		System.out.println(n+1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		method(n);
		sc.close();
	}
}
