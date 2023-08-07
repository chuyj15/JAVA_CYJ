package _1500;

import java.util.Scanner;

/* 문제
첫 줄에 이 삼각격자의 세로 길이 N이 입력된다.(2 <= N <= 20)
둘째 줄부터 N+1째 줄까지 (k, 1)의 격자판의 정보가 입력된다. ( 1 <= k <= N)

* 순서도
1. 크기가 N이 되도록 N을 입력받는다. 
2. N행N열의 2차원 배열을 생성한다.
3. N번 반복하여, N개의 정수를 배열1열에 순서대로 값을 대입한다.
4. 배열을 아래의 반복변수 i,j로 반복하여, 
	i : 1 ~ N-1
	j : 1 ~ i
	arr[i][j] = arr[i][j-1] - arr[i-1][j-1]
	수식으로 연산하여, ?(빈칸)에 값을 대입한다.
5. 배열을 반복하여, 값이 있는 삼각형의 모양의 부분만 출력한다.
 */

public class _1508ssam {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		
		for( int i = 0; i<N;  i++) {
			arr[i][0] = sc.nextInt();
		}
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j <=i; j++) {
				arr[i][j] = arr[i][j-1] - arr[i-1][j-1];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
