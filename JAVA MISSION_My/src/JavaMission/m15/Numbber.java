package JavaMission.m15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Numbber {

	//자동
	public static ArrayList<Integer> auto() {
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		
		for (int j = 0; j <6; j++) {
			Integer temp = (int) (Math.random()*45+1);
			//중복 제거 방법
			for (int k = 0; k < j; k++) {
				if (lottoList.get(k)==temp) {
					lottoList.remove(temp);
					j--;
				}
			}
			lottoList.add(temp);
		}
		//오름차순 정렬
		Collections.sort(lottoList);
		return lottoList;
	}
	
	//수동
		public static ArrayList<Integer> manual() {
			Scanner sc = new Scanner(System.in);
			ArrayList<Integer> lottoList = new ArrayList<Integer>();
			char symbol = '\u2460';
			for (int i = 0; i < 6; i++) {
				System.out.print(symbol++ +" : ");
				int n = sc.nextInt();
				lottoList.add(n);
			}
			return lottoList;
		}
	

		//당첨 번호, 보너스 번호 
		public static ArrayList<Integer> bonus() {
			ArrayList<Integer> bonu = auto();
			System.out.print("당첨 번호 : ");
			printArrayList(bonu);
			
			int bon ;
				do {
					bon = (int) (Math.random()*45+1);
				} while (bonu.contains(bon));
			System.out.println("보너스 번호: "+bon);
			
			bonu.add(bon);
			return bonu;
		}
		
	
		//배열을 받고 출력하는 메소드
		public static void printArrayList(ArrayList<Integer> lottoList) {
			Iterator<Integer> it = lottoList.iterator();
			while (it.hasNext()) {
				Integer item = it.next();
				System.out.print(item);
				if (it.hasNext()) System.out.print(" ");
				else System.out.println();
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
