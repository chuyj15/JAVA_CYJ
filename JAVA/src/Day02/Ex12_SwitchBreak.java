package Day02;

import java.util.Scanner;

public class Ex12_SwitchBreak {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		//입력받은 정수를 5로 나눈 나머지
		//2보다 작으면 "*" 출력
		//그렇지 않으면 "**" 출력
		// - switch문을 사용하여 작성하시오.
		/*
		 * switch (num%5) { case 0: case 1:System.out.println("*"); break; default:
		 * System.out.println("**"); break; }
		 * 
		 * sc.close();
		 */
		//다른 방법
		switch (num%5) {
		case 0:
		case 1:System.out.println("*");
			break;
		case 2:	
		case 3:	
		case 4:	
			System.out.println("**");
			break;
			//default 블록은 생략 가능하다.
		default: System.out.println("나머지가 4보다 큽니다.");
			break;
		}
		
		sc.close();
		
		
		
	}
}
