package _1200;

import java.util.Scanner;

public class _1468 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			int a=1;
			int b=0;
			for (int j = 0; j < arr[i].length; j++) {
				if (i%2==0) arr[i][j] = n*i+ a++;
				if (i%2==1) arr[i][j] = n*(i+1)- b++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

		
	}
}
