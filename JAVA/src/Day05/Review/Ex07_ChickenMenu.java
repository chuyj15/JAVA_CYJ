package Day05.Review;
import java.util.Scanner;

public class Ex07_ChickenMenu {
	
	//메뉴 출력
	public static void printMenu() {
		System.out.println("#####메뉴판#####");
		System.out.println("1.굽네치킨 - 볼케이노 치킨");
		System.out.println("2.BBQ - 황금올리브 반반 치킨");
		System.out.println("3.교촌치킨 - 허니콤보 치킨");
		System.out.println("4.BHC - 뿌링클 치킨");
		System.out.println("5.레드락 치킨 - 양념치킨");
		System.out.println("0. 종료");
		System.out.print("#####입력 : ");
	}
	//메뉴 선택
	public static String selectMenu(int menuNo) {
		String menuName = "";
		switch (menuNo) {
		case 1: menuName = "굽네치킨 - 볼케이노 치킨";break;
		case 2: menuName = "BBQ - 황금올리브 반반 치킨";break;
		case 3: menuName = "교촌치킨 - 허니콤보 치킨";break;
		case 4: menuName = "BHC - 뿌링클 치킨";break;
		case 5: menuName = "레드락 치킨 - 양념치킨";break;
		}
		return menuName;
	}
	
	public static void main(String[] args) {
		int menuNo =0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		int count = 0; 									//주문개수
		
		do {
			 printMenu();
			menuNo = sc.nextInt(); //메뉴번호 입력
			//종료조건
			if (menuNo ==0) break;
			menuName = selectMenu(menuNo);
			//유효성 검사
			if (menuNo>=1 && menuNo<=5) {
				System.out.println(menuName+"이/가 주문되었습니다.");
				count++;     //유효한 번호인 경우에만 주문수를 추가..
			} else {
				System.out.println("0~5번 사이의 숫자를 입력해주세요.");
			}
		} while (menuNo!=0); //여기까지 do-while문 
		sc.close();
		
		System.out.println(count+"개의 주문을 완료합니다.");
	
	}
}
