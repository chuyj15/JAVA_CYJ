package Day02;

public class Ex05_TernaryOperator {
	public static void main(String[] args) {
		//조건 연산자
		int a = 3, b=5;
		
		//a와 b의 두 수의 차이를 구하시오.
		//a-b=-2
		//b-a=2
		
		//조건 연산자(삼항 연산자)
		// (조건) ? : (참일 때 문장) : (거짓일 때 문장)
		// 조건식 ? 값1 : 값2
		int result = (a>b) ? a-b : b-a;
		
		System.out.println("두 수의 차: "+result);
		
		
		
		
		
		
		
		
	}
}
