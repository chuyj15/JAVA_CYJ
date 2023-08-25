package Ex01;
/*
 * [문제1번] 학생 5명의 JAVA 프로그래밍 성적을 입력 받아, 1차원 배열에 저장하고 성적을 기준으로 
오름차순, 내림차순으로 각각 출력하시오.(단, 정렬 방식은 선택정렬, 버블정렬, 삽입정렬 중 하나의 정
렬 방식을 이용하시오. 성적은 정수 0이상 100이하로 주어집니다.)
 */
//선택정렬을 이용함. 
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//삽입정렬
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		//입력받음
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		//오름차순
		 for (int i = 1; i < 5; i++) {
			 for (int j=i; j>0; j--) {
				 if (arr[j]<arr[j-1]) {
					 int k= arr[j];
					 arr[j]=arr[j-1];
					 arr[j-1]=k;
				 }
			}
		}
		 //오름차순 출력
		 for (int i : arr) {
			 System.out.print(i+" ");
		 }
		 
		 System.out.println();
		 //내림차순
		 for (int i = 1; i < 5; i++) {
			 for (int j=i; j>0; j--) {
				 if (arr[j]>arr[j-1]) {
					 int k= arr[j];
					 arr[j]=arr[j-1];
					 arr[j-1]=k;
				 }
			}
		}
		 //내림차순 출력
		 for (int i : arr) {
			 System.out.print(i+" ");
		 }
		sc.close();
	}
}
