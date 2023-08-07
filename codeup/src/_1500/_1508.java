package _1500;

import java.util.Scanner;

/* 문제
첫 줄에 이 삼각격자의 세로 길이 N이 입력된다.(2 <= N <= 20)
둘째 줄부터 N+1째 줄까지 (k, 1)의 격자판의 정보가 입력된다. ( 1 <= k <= N)

* 순서도
1. 크기가 N이 되도록 N을 입력받는다. 
2. 첫번째 행들을 입력받는다. (N개)
3. 첫번째 줄에는 첫번째 입력받은 값이 출력된다. 
4. 두번째 줄에는 두번째 입력받은 값에서 첫번째 입력받은 값을 뺀 값이 두번째 값에 들어간다. 
5. n번째 줄: n개의 배열을 만들고, 
n행1열: 입력값을 대입한다. 
n행k열: (n행k-1열) - (n-1행k열) 값을 대입한다. 
각 행마다 출력한다. 
 */

public class _1508 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr ;
		int N = sc.nextInt();
		arr = new int[N];
		for( int i = 0; i<N;  i++) {
			arr[i] = sc.nextInt();
		}
		int[][] fin;
		fin = new int[N][N]; 
		
		for (int i = 0; i < fin.length; i++) {
			fin[i][0] = arr[i];
		}
		for (int i = 1; i < fin.length; i++) {
			for (int k = 1; k < fin.length; k++) {
				if (i<k) break;
				fin[i][k] = fin[i][k-1]- fin[i-1][k-1];
				
			}
		}
		
		for (int i = 0; i < fin.length; i++) {
			for (int j = 0; j < fin.length; j++) {
				if (fin[i][j]==0) break;	
				System.out.print(fin[i][j]+" ");
				
			}
			System.out.println();
		}
		
		sc.close();
	}
}
