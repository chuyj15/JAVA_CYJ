package Day02;

public class Ex04_BitOperator {
	public static void main(String[] args) {
		
		
		// AND
		int result = 20 & 16;
		System.out.println(result);
		//Integer.toBinaryString(): 십진수를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));  //10100
		System.out.println(Integer.toBinaryString(16));  //10000
		System.out.println("----------------------"); 
		System.out.println(Integer.toBinaryString(result));  //10000
		System.out.println();		
	
		// OR
		int result2 = 20 | 16;
		System.out.println(result2);
		//Integer.toBinaryString(): 십진수를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20)); 
		System.out.println(Integer.toBinaryString(16)); 
		System.out.println("----------------------"); 
		System.out.println(Integer.toBinaryString(result2)); 
		System.out.println();		
	
		// XOR
		int result3 = 20 ^ 16;
		System.out.println(result3);
		//Integer.toBinaryString(): 십진수를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20)); 
		System.out.println(Integer.toBinaryString(16)); 
		System.out.println("----------------------"); 
		System.out.println(Integer.toBinaryString(result3)); 
		System.out.println();		
	
		
		
		
		
		// NOT
		//~0001 0100   (20)
		//----------
		// 1110 1011   우리의 기대는 이거였는데..

		//int (4byte=32bit) 니까 이진수로 표현하면 32자리가 됨..
		//0000 0000 0000 0000 0000 0000 0001 0100 (20)   에 not 이면
		//1111 1111 1111 1111 1111 1111 1110 1011 (-21)
		System.out.println("NOT");
		int result4 = ~20; 
		System.out.println(result4); //-21 ??왜??
		//이진수에선 양수음수를 나타낼 수 없음. +,- 부호 붙일 수 없음. 
		//그래서 최상위비트에서 양수, 음수를 관리해줄 수 있음.
		//최상위비트(MSB)
		//부호가 있는 수의 경우는 최상위비트를 부호비트로 사용한다. 
		//MSB 0 -->양수
		//MSB 1 -->음수
		//1의 보수 연산 : 0>1, 1->0 변환
		//2의 보수 연산 : (양수<->음수)
		//		1의 보수 연산을 하고, (+1)을 해주면 됨.
		
		System.out.println(Integer.toBinaryString(20));  //10100
		System.out.println("--------"); 
		System.out.println(Integer.toBinaryString(result4)); 
		//11111111111111111111111111101011
		System.out.println();
		
		
		

		//0000 0000 0000 0000 0000 0000 0000 0010 (십진수:2)   에 not 이면
		//1111 1111 1111 1111 1111 1111 1111 1101 		1의 보수
		//									   +1
		//1111 1111 1111 1111 1111 1111 1111 1110 (십진수:-2) 
		
		
		//시프트 연산
		// - 산술 시프트( <<, >>)
		// : 부호 비트를 유지하면서, 왼쪽 또는 오른쪽으로 비트를 이용시키는 연산자
		//	 부호 비트는 안바뀜!!!
		
		// - 논리 시프트( <<<, >>>)
		// : 부호 비트를 포함하여, 왼쪽 또는 오른쪽으로 비트를 이동시키는 연산자
		
		//0000 0010 (2) : 전부다 왼쪽으로 한칸씩 이동 : 2^1
		//0000 0100 (4) : 2^2
		//0000 1000 (8) : 2^3
		
		System.out.println("<<연산하면 2배씩 증가");
		System.out.println(2<<1); //왼쪽으로 비트를 1칸 이동 //4
		System.out.println(2<<2); //왼쪽으로 비트를 2칸 이동 //8
		System.out.println(2<<3); //왼쪽으로 비트를 3칸 이동 //16
		System.out.println();
		
		System.out.println(">>연산하면 1/2배씩 감소");
		System.out.println(16>>1); //오른쪽으로 비트를 1칸 이동 //8
		System.out.println(16>>2); //오른쪽으로 비트를 2칸 이동 //4
		System.out.println(16>>3); //오른쪽으로 비트를 3칸 이동 //2
		System.out.println();
		

		System.out.println("부호가 있는 경우");
		System.out.println(-2<<1); //왼쪽으로 비트를 1칸 이동 //-4
		System.out.println(-2<<2); //왼쪽으로 비트를 2칸 이동 //-8
		System.out.println(-2<<3); //왼쪽으로 비트를 3칸 이동 //-16
		System.out.println();
		
		//-2를 이진수로 표현하고 31칸 오른쪽으로 이동(비트연산자 포함)
		System.out.println(-2>>>31); //1
		System.out.println(Integer.toBinaryString(2) ); //10
		System.out.println(Integer.toBinaryString(-2) ); //11111111111111111111111111111110
		System.out.println();
		
	}
}
