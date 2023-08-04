package Day09.Ex01_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

//java.lang :자바에서 가장 기본이 되는 패키지들이 모여있어서 import하지 않아도 자동으로 import됨. 
//System. : 이런것도 java.lang에 있음. 

public class InputMisMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		String menuName="";
		
		do {
			System.out.println("1.Java");
			System.out.println("2.HTML");
			System.out.println("3.CSS");
			System.out.println("4.JavaScript");
			System.out.println("0.종료");
			System.out.println("입력 : ");
			
			//예외메세지:  java.util.InputMismatchException
			try {
				menuNo = sc.nextInt(); 	//예외발생 가능성 있는 문장
			} catch (InputMismatchException e) {
				//숫자를 입력하지 않았으면 , 다시 반복해서 입력하도록...
				sc.next(); //입력 스트림에 남아있는 (엔터) 비움
				System.err.println("(0~4) 사이의 정수를 입력해주세요.");
				continue;
			}

			//종료조건
			if (menuNo==0) {
				break;
			}
			
			switch (menuNo) {
				case 1: menuName="Java"; break;
				case 2:menuName="HTML"; break;
				case 3:menuName="CSS"; break;
				case 4:menuName="JavaScript"; break;
				default:menuName="선택없음";break;
			}
			System.out.println(menuName+"(을/를) 공부합니다");
		} while (true);
		
		sc.close();
	}
}
