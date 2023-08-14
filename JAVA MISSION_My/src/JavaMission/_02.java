package JavaMission;
//완료
import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		//홀수 합계
		for (int i = 0; 2*i+1 < n ; i++) {
			if ( 2*i+1 ==n || 2*i+1 ==n-1) System.out.print(2*i+1+"=");
			else System.out.print(2*i+1+"+");
				sum1 +=  2*i+1 ;
		}
		System.out.println(sum1);
		
		//짝수 합계
		for (int i = 1; 2*i <= n ; i++) {
			if ( 2*i ==n || 2*i ==n-1) System.out.print(2*i+"=");
			else System.out.print(2*i+"+");
				sum2 +=  2*i ;
		}
		System.out.println(sum2);
		
		
		//약수 출력
		for (int j = 0; j < n; j++) {
			if (n%(j+1)==0) {
				System.out.print(j+1+" ");
			}
		}
		sc.close();
	}
}
