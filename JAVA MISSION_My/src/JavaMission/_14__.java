package JavaMission;
//완료
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _14__ {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("몇 게임?");
		int N = sc.nextInt();
		sc.nextLine();
		int round = 1;
		
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> lottoList = new ArrayList<Integer>();
			
			for (int j = 0; j <6; j++) {
				Integer temp = (int) (Math.random()*45+1);
				//중복 제거 방법(1)
//				for (Integer b : lottoList) {
//					if (b == temp) {
//						lottoList.remove(temp);
//						j--;
//					}
//				}
				//왜 foreach문으로 했을 때는 ConcurrentModificationException 에러가 나나요??
				//중복 제거 방법(2)
				for (int k = 0; k < args.length; k++) {
					if (lottoList.get(k)==temp) {
						lottoList.remove(temp);
						j--;
					}
				}
				lottoList.add(temp);
			}
			//오름차순 정렬
			Collections.sort(lottoList);
			
			System.out.print("["+ round++ +" 게임] : ");
			for (Integer integer : lottoList) {
				System.out.print(integer+" ");
			}
			System.out.println();
		}
		
	}
	
	
}