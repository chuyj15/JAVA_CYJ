package Day09.Ex01_TryCatch;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;		//피제수 - 나눠지는 수
		int b;		//제수 - 나누는 수
		
		System.out.println("a: ");
		a = sc.nextInt();
		
		System.out.println("b: ");
		b = sc.nextInt();
		
		// 예외메세지: java.lang.ArithmeticException: /by zero
		// 예외처리문 : try~catch
		// try : ctrl + space
		try {
			//예외발생가능성이 있는 문장
			System.out.println("a/b= "+a/b);
		// catch(예외타입 객체명){ }
		} catch (ArithmeticException e) {
			//예외발생시, 실행할 예외 처리 문장
			System.err.println("0으로 나누는 연산은 수학적으로 정의되지 않습니다.");
		}
		//finally블록 생략가능
		finally {
			//예외 발생과 무관하게 실행하는 문장
			//주로 예외 처리와 관련한 문장을 작성(메모리 해제 등)
			System.out.println("메모리를 해제합니다.."); //사실 finally를 안써도 됨. 그 밑에 쓰면 되니까. 하지만 예외처리관련한 문장을 씀.
			sc.close();
		}
		System.out.println("프로그램을 종료합니다...");
		
	}
}