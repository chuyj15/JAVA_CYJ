package JavaMission;
//수정중//모르겠음. .. ㅠㅠㅠ
import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum2 = 0;
		int sum1 = 0;
		//n=10
		for (int i = 0; 2*i+1 < n ; i++) {
			System.out.print(2*i+1+"+");
	//		if ( 2*i+1 =n
				sum1 +=  2*i+1 ;
		}
	//	System.out.print();
		
		
		
		
		
		
		
		System.out.println(sum1);
		System.out.println(sum2);
		for (int j = 0; j < n; j++) {
			if (n%(j+1)==0) {
				System.out.print(j+1+" ");
			}
		}
		sc.close();
	}
}
