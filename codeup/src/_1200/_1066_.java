package _1200;

import java.util.Scanner;

public class _1066_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		//조건연산자 사용
		String result1 = a%2==1 ? "odd":"even";
		String result2 = b%2==1 ? "odd":"even";
		String result3 = c%2==1 ? "odd":"even";
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		sc.close();
		
		
	}

}
