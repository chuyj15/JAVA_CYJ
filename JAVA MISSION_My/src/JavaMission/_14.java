package JavaMission;

import java.util.ArrayList;
import java.util.Scanner;

public class _14 {
	ArrayList<Integer> arrList;
	
	//1~45 사이의 수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임?");
		int n= sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> arrList = new ArrayList<>();	//for문 안에서 새롭게 arrayList를 생성해야 게임마다 다르게 수가 나옴. ....
			System.out.print("["+i+" 게임] : ");
			
			for (int j = 0; j < 6; j++) {
				int a= (int) (Math.random() *45 +1);	//()를 쓰지 않으면 1만 계속 나옴. int타입으로 변환하니깐..
				arrList.add(a);
			
				//중복 제거
				for (int k = 0; k < j; k++) {
					if (a==arrList.get(k)) j--;
				}
			
				//오름차순 정렬
//				for (int k1 = 0; k1 < arrList.size()-1; k1++) {
//					for (int k2 = 1; k2 < arrList.size() ; k2++) {
//						if (arrList.get(k1) > arrList.get(k2)) {
//							int b = arrList.get(k1);
//							arrList.set(k1, arrList.get(k2));
//							arrList.set(k2, b);
//						}
//					}
//				}
				
				
				
				System.out.print(arrList.get(j)+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
