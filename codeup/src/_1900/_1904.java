package _1900;

import java.util.Scanner;

public class _1904 {
	int a;
	
	public static void method(int a, int b) {
		if (b==a-1) return;
		method(a, b-1);
		if (b%2==1)
			System.out.print(b+" ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		method(a,b);
		sc.close();
	}
		
	
	
}
