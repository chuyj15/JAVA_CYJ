package JavaMission;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class _06ArrayList {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int g = 0; g < num; g++) {
			System.out.print("["+(g+1)+" 게임] : ");
			ArrayList<Integer> game = new ArrayList<>();	
			//이걸 위에다가 선언하면 그냥 게임이 다 똑같이 나옴. 그래서 새로 바꿔줘야 함. ~!~!
			
			//리스트에 임의의 수 집어넣기
			//while (game.size() == 5)라고 하면 5일 때만 실행하는 거임. 
			while (game.size() <= 5) {
				int n= random.nextInt(44);
				int N= n+1;
				if (game.contains(N)) {
					continue;
				} else {
					game.add(N);
				}
			}
			//오름차순 정렬, 프린트
			game.stream().sorted().forEach( k->System.out.print(k+" "));
			//아니면 
			//Collections.sort(game); //해도 됨.
			
			System.out.println();
		}
		
		sc.close();
	}
}
