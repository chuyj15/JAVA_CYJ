package Day05.Review;
import java.util.Scanner;
/*
   #####메뉴판#####
   1. 굽네치킨 - 볼케이노 치킨
   2. BBQ - 황금올리브 반반 치킨
   3. 교촌치킨 - 허니콤보 치킨
   4. BHC - 뿌링클 치킨
   5. 레드락 치킨 - 양념치킨
   0. 종료
   #####입력 : 
   
   메뉴번호에 따라 메뉴 변수에 해당메뉴를 저장해주고, 
   "(해당메뉴)이 주문되었습니다."라고 출력하시오.
   0을 입력하기 전까지 반복하고, 0을 입력하면 반복을 종료합니다.
   종료 시, "?개의 주문을 완료합니다." 라고 출력하시오.
 */
public class Ex07_ChickenMenu2 {
	public static void main(String[] args) {
		int menuNo =0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		int count = 0; 									//주문개수
		
		do {
			System.out.println("#####메뉴판#####");
			System.out.println("1.굽네치킨 - 볼케이노 치킨");
			System.out.println("2.BBQ - 황금올리브 반반 치킨");
			System.out.println("3.교촌치킨 - 허니콤보 치킨");
			System.out.println("4.BHC - 뿌링클 치킨");
			System.out.println("5.레드락 치킨 - 양념치킨");
			System.out.println("0. 종료");
			System.out.print("#####입력 : ");
			menuNo = sc.nextInt(); //메뉴번호 입력
			
			//종료조건
			if (menuNo ==0) break;
			
			switch (menuNo) {
				case 1: menuName = "굽네치킨 - 볼케이노 치킨";break;
				case 2: menuName = "BBQ - 황금올리브 반반 치킨";break;
				case 3: menuName = "교촌치킨 - 허니콤보 치킨";break;
				case 4: menuName = "BHC - 뿌링클 치킨";break;
				case 5: menuName = "레드락 치킨 - 양념치킨";break;
			}
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
