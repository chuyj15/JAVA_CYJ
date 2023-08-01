package Day02;

public class Ex15_OddEven {
	public static void main(String[] args) {
		//1~20까지의 정수 중, 
		//홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
		//1+3+5+7+9+11+13+15+17+19=sum1
		//2+4+~~+20=sum2
		
		/*
		int a=2;
		int b=1;
		int sum1=0;
		int sum2=0;
	
		while (a<=20) {
			sum1 +=a;
			a= a+2;
		}
		System.out.println("짝수의 합계: " + sum1);
		
		while (b<=20) {
			sum2 +=b;
			b= b+2;
		}
		System.out.println("홀수의 합계: " + sum2);
		*/
		
		
		
		//다른 방법

		int a=1;
		int sum1=0;
		int sum2=0;
		while(a<=20) {
			if (a%2==1) {
				sum1 += a;
			}else {
				sum2 += a;
			}
			a++;
		}
		System.out.println("짝수의 합계: " + sum1);
		System.out.println("홀수의 합계: " + sum2);
			
		
		
	}
}
