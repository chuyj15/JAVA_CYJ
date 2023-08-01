package Day01;

public class Ex10_FloatDouble {
	public static void main(String[] args) {
		//실수 타입 변수 선언
		double var1 = 3.14D; //- double타입은 리터럴 D 생략가능
							//자바에서는 기본적으로 실수를 double로 취급함.
		
		float var2 = 3.14F;  //- float 타입 리터럴: 실수F
		
		//실수형 정밀도 : double(8byte) float(4byte)
		double var3 = 0.12345789123456789;
		float var4 = 0.123456789123456789F; //var4 : 0.12345679
		//float var4 = 0.123456789123456789; //F를 안쓰면 오류남. 우항을 double로 인식하기 때문.
		
		//원주율(파이)
		double PI = Math.PI;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("원주율 PI : " + PI);
		
	}
}
