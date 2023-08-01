package Day02;

public class Ex14_WhileSum {
	public static void main(String[] args) {
		//1부터 100까지 합계를 구하시오.
		//1+2+3+4+...+100=5050
		
		int a=1;
		int sum=0;
		
		while (a<=100) {
			sum += a++;
		}
		
		System.out.println("합계: "+sum);
	}
}
