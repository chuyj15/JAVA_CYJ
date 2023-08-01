package Day02;

public class Ex03_LogicalOperator {

	public static void main(String[] args) {
		
		//논리 연산자
		//AND (&&) 엔펄센드
		//A AND B : A와 B 둘 다 true일 때, 결과가 true
		//A    B      결과
		//----------------
		//F    F      F
		//T    F      F
		//F    T      F
		//T    T      T
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println();
		
		//OR (||)
		//하이프: shift+백슬래쉬(\)
		//A OR B : A와 B 둘 중 하나라도 true일 때, 결과가 true
		//A    B      결과
		//----------------
		//F    F      F
		//T    F      T
		//F    T      T
		//T    T      T
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(true || (100<50));
		System.out.println((5>20) || (5>2));
		System.out.println();
		
		//XOR(^)
		//A XOR B : A 와 B 가 다를 때, 결과가 true
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println((9>=2) ^ (7>4));
		System.out.println();
		
		//not (!)
		//!A : A true이면 false, A flase이면 true로 변환
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		//쇼트서킷: 이미 결과 아는 경우 뒤 피연산자 부분을 실행하지 않고 넘어가는 것. 
		int value1 = 3;
		System.out.println(false && ++value1 > 10); // 뒤 피연산자는 실행을 안하니까
		System.out.println(value1);					//값이 증가를 안한거임~! 3
		int value2 = 3;
		System.out.println(true || ++value2>5); // 뒤 피연산자는 실행을 안하니까
		System.out.println(value2);				//값이 증가를 안한거임~! 3
		
		//비트 연산자
		//비트 연산자의 경우는 쇼트 서킷이 적용되지 않는다. 
		int value3 = 3;
		System.out.println(false & ++value3 > 10); //쇼트서킷이 사라짐!!
		System.out.println(value3);					//4
		int value4 = 3;
		System.out.println(true | ++value4>5);
		System.out.println(value4);             	//4
		
		
		
		
		
	}

}
