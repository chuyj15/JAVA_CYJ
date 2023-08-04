package _1200;

import java.util.Scanner;

public class _1468__ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr1[][] = new int[n][n];
		int a=1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (i%2==0) arr1[i][j] =a++;
				if (i%2==1) arr1[i][n-1-j] =a++;
			}
			
		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}