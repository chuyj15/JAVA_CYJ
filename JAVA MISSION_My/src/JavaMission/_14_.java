package JavaMission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Lottoria{
	int[] tempList = new int[6];
}

public class _14_ {
static Scanner sc = new Scanner(System.in);	
	public static void main(String[] args) {
		Lottoria lria = new Lottoria();
		System.out.println("몇 게임?");
		int games = sc.nextInt();
		sc.nextLine();
		for (int p = 0; p < games; p++) {
			
		Integer[] list = new Integer[6];
		for (int i = 0; i < 6; i++) {
			int a = (int) (Math.random() *45 +1);
			list[i] = a;
			//중복 제거
			for (int j = 0; j >i; j++) {
				if (a == list[j])
					j--;
			}
			
		}
		//오름차순 정렬
		for (int i = 0; i < list.length-1; i++) {
			for (int j = i+1; j < list.length; j++) {
				if (list[i]>list[j]) {
					int temp = list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
		ArrayList<Integer> lottoList = new ArrayList<>();
//		lottoList.addAll(list);
		}
	}
}
	
	