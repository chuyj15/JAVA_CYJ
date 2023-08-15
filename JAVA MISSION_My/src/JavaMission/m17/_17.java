package JavaMission.m17;

import java.util.Scanner;

/*
 * 더조은 아카데미에서는 수강생들의 자율학습 환경을 제공하기 위하여 스터디 카페를 개설하였다. 
1층에는 오픈라운지 40석, 2층에는 미디어실 20석, 3층에는 프로젝트실 30석을 수용할 수 있는 공간이 마련되었다.
수강생들은 수강번호와 이름을 입력하고 원하는 자리를 선택하여 이용할 수 있다. <실행결과>를 참고하여 자석 관리 시스템을
완성하시오
 */
public class _17 {
	public static void main(String[] args) {
		/*
		************** 조은의 스터디카페 *************
		1. 이용하기
		2. 반납하기
		3. 좌석현황
		0. 종료하기
		========================================
		>>입력 : 1
		>>수강번호 : 20
		>>이름 : 김조은
		(1) 1F - 오픈라운지
		(2) 2F - 미디어실
		(3) 3F - 프로젝트실
		>>입력 : 1
		*/
		
		System.out.println("************** 조은의 스터디카페 *************");
		System.out.println("1. 이용하기");
		System.out.println("2. 반납하기");
		System.out.println("3. 좌석현황");
		System.out.println("0. 종료하기");
		System.out.println("========================================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print(">>입력 : ");
		int key = sc.nextInt();
		
		switch (key) {
		case 1:
			System.out.print(">>수강번호 : ");
			int classnum = sc.nextInt();
			String name = sc.next();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 0:
			
			break;
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
