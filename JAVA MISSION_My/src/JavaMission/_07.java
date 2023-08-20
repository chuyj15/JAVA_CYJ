package JavaMission;

import java.util.Scanner;

/*
 * 학생 5명의 JAVA 프로그래밍 성적을 입력 받아, 
 * 1차원 배열에 저장하고 성적을 기준으로 오름차순, 내림차순으로 각각 
 *출력하시오.
(단, 정렬 방식은 선택정렬, 버블정렬, 삽입정렬 중 하나의 정렬 방식을 
이용하시오. 성적은 정수 0이상 100이하로 주어집니다.)
 */
public class _07 {
	//선택정렬 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		//오름차순 정렬
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if ( arr[i] > arr[j]) {
					int a= arr[i];
					arr[i] = arr[j];
					arr[j]=a;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//내림차순 정렬
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if ( arr[i] < arr[j]) {
					int a= arr[i];
					arr[i] = arr[j];
					arr[j]=a;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		sc.close();
	}
}
