package Day05.Review;

import java.util.Scanner;

public class Ex06_Matrix {
	public static void main(String[] args) {
		//양의 정수를 M과 N을 입력받아 저장하고, 
		//M행 N열의 2차원 배열을 생성한다.
		//각 요소의 값을 입력받고, 그대로 출력하시오.
		//(입력 예시)
		//M:2
		//N:3
		//(출력 예시)
		//123
		//456
		
		Scanner sc = new Scanner(System.in);
		int M, N, X, Y;
//		System.out.print("M : ");
//		M=sc.nextInt();
//		System.out.print("N : ");
//		N = sc.nextInt();
//		//M행 N열의 2차원 배열 선언 및 생성
//		int arr[][] = new int[M][N];
//		//2차원배열은 이중반복문으로 접근한다. 
//		//바깥 반복문 - 반복변수 i : 행 접근
//		//안 반복문   - 반복변수 j : 열 접근
//		//arr.length    : 행 크기
//		//arr[i].length : 열 크기
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//위와 같이, X행Y열 2차원 배열을 생성하고, 
		//순서대로 값을 입력받아 그대로 출력해보세요.
		//단, 출력 시 foreach문을 사용
		System.out.print("X : ");
		X=sc.nextInt();
		System.out.print("Y : ");
		Y = sc.nextInt();
		
		int[][] arr1= new int[X][Y];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		//출력시 foreach 사용
		for (int[] row : arr1) { //arr1의 요소는 1차원 배열 타입
			for (int col : row) { //1차원 배열 안엔 int 값이 하나씩 있는 거임.
				System.out.print(col+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}