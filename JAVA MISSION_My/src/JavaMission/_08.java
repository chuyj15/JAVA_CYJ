package JavaMission;

import java.util.Scanner;

/*
 * 정수 N을 입력 받아, N행 N열의 2차원 배열을 선언하시오. 그리고 배열요소의 1부터 1씩 증가하는 값을 순서대로 저장하면서
1 행이 증가할 때마다 배열요소에 접근하는 방향을 반대로 하여 값을 저장하고 출력하시오.
(설명)
입력이 3 인 경우,
   [0][1][2]
[0] 1  2  3
[1] 6  5  4
[2] 7  8  9

입력이 5 인 경우,
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25

 */
public class _08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[][] arr = new int[n][n];
		//행이 0,2 같은 짝수면  오름차순. 첫번째 값: n*i+1
		//행이 1,3 같은 홀수면 내림차순   첫번째 값: n*(i+1)
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//짝수
				if (i%2==0) {
					arr[i][j] = n*i+1+j;
				} else {	//홀수
					arr[i][j] = n*(i+1)-j;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
