package _1200;

import java.util.Scanner;

public class _1468__2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[][] = new int[n][n];
		int k=1;
		int sw=1;
		
		for (int i = 0; i < arr.length; i++) {
			if (sw==1) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j]=k++;
				}
				sw=0;
			}
			else {
				for (int j = n-1; j >=0; j--) {
					arr[i][j]=k++;
				}
				sw=1;
					
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}