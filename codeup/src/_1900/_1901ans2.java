package _1900;

import java.util.Scanner;

//1부터 정수 n까지 출력하는 재귀함수를 설계하시오.

public class _1901ans2 {
		
	//내가 쓴 답
	public static void method(int n) {
		if (n==0) return;
		method(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		method(n);
		sc.close();
	}
}
