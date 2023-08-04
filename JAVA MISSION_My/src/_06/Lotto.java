package _06;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int n= sc.nextInt();
		//Math.random() : 0.0이상 1.0 미만의 임의의 값을 반환
		//(공식)
		//[시작숫자]~[개수] 사이의 랜덤한 정수
		// : (int) (Math.random()*[개수]+[시작숫자])
		int []arr;
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			double random = Math.random();
			int lottoNum = (int) (random*45+1);
			arr[i] = lottoNum;
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	//나중에 해야할 것 (1) 중복은 어떻게 거를것인가 (2) 오름차순 정렬
}
