package JavaMission;
/*
 * 정수 1부터 100까지 의 수를 출력하면서, 해당 수 가 3 또는 6 또는 9에 해당하는 경우
해당 정수 대신에 3, 6, 9가 포함되는 개수만큼 “*” 를 출력하는 프로그램을 작성하시오.

 * 순서도
 1. 1~100까지 수에서, 
 2. 만약 첫째자리, 둘째자리 모두 369면 **을 출력한다.
 3. elseif 첫째자리 혹은 둘째자리 둘중 하나라 369면 **을 출력한다. 
 4. else 수를 출력한다.
 
 첫째자리 구하는 방법: n%10
 둘째자리 구하는 방법: n/10
 one369 = n%10==3 || n%10==6 || n%10==9
 ten369 = n/10==3 || n/10==6 || n/10==9
 */

public class _03 {
	public static void main(String[] args) {
		int n=1;
		//첫째자리 구하는 
		for (int i = 0; i < 100; i++) {
			boolean one369 = n%10==3 || n%10==6 || n%10==9;  //1의 자리가 369인지?
			boolean ten369 = n/10==3 || n/10==6 || n/10==9;  //10의 자리가 369인지?
			if (one369 && ten369) {
				System.out.println("**");
			} 
			else if (one369 || ten369) {
				System.out.println("*");
			}
			else {
				System.out.println(n);
			}
			n++;
		}
		
		
		
	}
	
	
}
