package _1900;

import java.util.Scanner;

//1부터 정수 n까지 출력하는 재귀함수를 설계하시오.

public class _1901 {
		
	
	public static void method(int n) {
					if (n==0) return;				//재귀함수에는 반드시 종료조건이 있어야 함. 
			method(n-1);
			System.out.println(n);
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n; //while문 안에서 n을 선언해버리면 바깥에서 n을 쓸수가 없음. 따라서 n을 밖에서 먼저 선언해줘야 함. 
			while (true) {
				n=sc.nextInt();
				if (n<1 || n>200) {
					System.out.print("1부터 200까지의 정수를 입력하시오");
				} else {
					break;
				}
			}
			
			method(n); //? 왜 오류가 나는지 모르겠음. 
			sc.close();
		}
}
