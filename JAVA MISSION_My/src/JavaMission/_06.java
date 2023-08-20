package JavaMission;

import java.util.Arrays;
import java.util.Random;

/*
 * 정수 N을 입력받아 N개의 게임의 로또 번호를 출력하시오. 
즉, 6개의 배열요소를 갖는 1차원 배열을 선언하여 1~45 사이의 랜덤한 값을 중복되지 않도록 저장하고 출력하는 과정을 N번
반복하시오.
(힌트)
- Math.random(); 메소드
: 0.0이상 1.0미만의 임의의 값을 반환
- Random random = new Random();
random.nextInt(N);
: 0이상 N이하의 임의의 정수타입의 값을 반환
 */
public class _06 {
	public static void main(String[] args) {
		int[] game = new int[6];
		
		Random random = new Random();
		
		for (int k = 0; k < 5; k++) {
			
			//배열에 임의의 수 집어넣기
			for (int i = 0; i < game.length; i++) {
				int n= random.nextInt(44);
				int N= n+1;
				game[i]=N;
				//중복제거
				for (int j = 0; j < i; j++) {
					if (game[j]==N) {
						i--; break; //break를 써주는게 더 안전하겠따.
					}
						
				}
			}
			//오름차순 정렬
			Arrays.sort(game);	//반환객체 없음
			
			//출력
			System.out.print("["+(k+1)+" 게임] : ");
			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i]+" ");
			}
			System.out.println();
		}
	}
	

}
