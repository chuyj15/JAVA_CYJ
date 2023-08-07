package _1900;

import java.util.Scanner;

public class _1905 {
	static int sum;
	
	public static void method(int n) {
		sum += n;
		if (n==0) return;
		method(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		method(n);
		System.out.println(sum);
		
		
		sc.close();
	}
}
