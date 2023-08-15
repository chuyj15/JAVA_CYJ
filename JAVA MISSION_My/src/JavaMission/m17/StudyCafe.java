package JavaMission.m17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StudyCafe {
	int canUseSit;
	static Scanner sc = new Scanner(System.in);
	
	//1층 구조도
	/*
	 * ================== 1층 ==================
01 02 03 04 05 06 07 08 09 10 
11 12 13 14 15 16 17 18 19 --
21 22 23 24 25 26 27 28 29 30 
31 32 33 34 35 36 37 38 39 40 
========================================
이용가능 : 39
	 */
	public static void floor1() {
		System.out.println("================== 1층 ==================");
		DecimalFormat df = new DecimalFormat("00");
		int n = 1;
		for (int i = 1; i < 41; i++) {
			System.out.print(df.format(n++)+" ");
			if (i==10 || i==20 || i==30) {
				System.out.println();
			}
			//만약 i번째가 이용하는 자리라면, i번째는 --으로 출력하기
		}
		System.out.println("========================================");
		//이용가능한 좌석수 출력
		
	}
	
	
	//2층 구조도
	/*
	 * ================== 2층 ==================
01 02 03 04 
05 06 07 08 
09 10 11 12 
13 14 15 16 
17 18 19 20 
========================================
이용가능 : 20석
	 */
	public static void floor2() {
		System.out.println("================== 2층 ==================");
		DecimalFormat df = new DecimalFormat("00");
		int n = 1;
		for (int i = 1; i < 21; i++) {
			System.out.print(df.format(n++)+" ");
			if (i==4 || i==8 || i==12 || i==16 || i==20) {
				System.out.println();
			}
			//만약 i번째가 이용하는 자리라면, i번째는 --으로 출력하기
		}
		System.out.println("========================================");
		//이용가능한 좌석수 출력
		
	}
	
	
	//3층 구조도
		/*
		 * ================== 3층 ==================
01 02 03 04 05 
06 07 08 09 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 
26 27 28 29 30 
========================================
이용가능 : 30석
		 */
		public static void floor3() {
			System.out.println("================== 3층 ==================");
			DecimalFormat df = new DecimalFormat("00");
			int n = 1;
			for (int i = 1; i < 31; i++) {
				System.out.print(df.format(n++)+" ");
				if (i==5 || i==10 || i==15 || i==20 || i==25 || i==30) {
					System.out.println();
				}
				//만약 i번째가 이용하는 자리라면, i번째는 --으로 출력하기
			}
			System.out.println("========================================");
			//이용가능한 좌석수 출력
			
		}
		
		//1층, 2층, 3층 선택하는 메소드
		public static void whatFloor(int key) {
			System.out.println("(1) 1F - 오픈라운지\n(2) 2F - 미디어실\n(3) 3F - 프로젝트실");
			System.out.print(">>입력 : ");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("================ 이용현황 =================");
				floor1();
				break;
			case 2:
				System.out.println("================ 이용현황 =================");
				floor2();
				break;
			case 3:
				System.out.println("================ 이용현황 =================");
				floor3();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
