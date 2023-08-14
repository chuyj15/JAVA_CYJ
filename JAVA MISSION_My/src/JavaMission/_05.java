package JavaMission;

import java.util.Scanner;

/*
 메뉴판 출력
 정수 입력받기
 1~3 입력하면 메뉴이름, 주문안내 문구 출력
 0 입력하면 주문메뉴개수, 주문완료메세지 출력
 이외번호 입력하면, 0~3 번호 입력하라는 안내문구 출력
 */
public class _05 {
	
	public static void menu() {
		System.out.println("********** 치킨 메뉴판 **********");
		System.out.println("1. 황금올리브 반반한 치킨");
		System.out.println("2. 뿌잉클 치킨");
		System.out.println("3. 처갓집에서 호식이가 만든 치킨");
		System.out.println("0. 종료");
		System.out.println("********** 번호 : ");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		int key;
		
		
		do {
			menu();
			key = sc.nextInt();
			System.out.println();
			
			switch (key) {
			case 1:
				System.out.println("황금올리브 반반한 치킨이(/가) 주문되었습니다. \n\n");
				i++;
				break;
			case 2:
				System.out.println("뿌잉클 치킨이(/가) 주문되었습니다. \n\n");
				i++;
				break;
			case 3:
				System.out.println("처갓집에서 호식이가 만든 치킨이(/가) 주문되었습니다.\n\n");
				i++;
				break;
			case 0:
				System.out.println("총 "+i+" 개의 상품이 주문되었습니다.\n\n");
				break;
	
			default:
				System.out.println("(0~3) 사이의 번호를 입력해주세요.\n\n");
				break;
			}
		} while (key != 0);
		
		sc.close();
	}
}
