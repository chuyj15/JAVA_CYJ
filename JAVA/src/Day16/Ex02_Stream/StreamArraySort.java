package Day16.Ex02_Stream;

import java.util.Arrays;

public class StreamArraySort {
	
	
	//메인메소드
	public static void main(String[] args) {
		int arr[] = {10,5,2,3,4};
		Arrays.stream(arr).sorted();	//int stream 형태임. 
		
		
		//이전에 배웠던 얘는 arr의 배열을 바꾸어줌. 
		//Arrays.sort(arr);  //2 3 4 5 10 
		
		//복사된 배열에 정렬을 적용시켜줌. 
		int sortedArr[] = Arrays.stream(arr).sorted().toArray();		//그걸 또 배열로 바꾸어줌.
		//sorted() : 여기서는... 요소들을 클래스로 바꾸는게 자동적으로 되어있음. 
		
//		System.out.println(arr); //	[I@6f75e721 라고 출력됨
		
		System.out.println("기본 배열에 정렬을 적용 X ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();

		
		System.out.println("-오름차순 정렬");
		System.out.println("복사된 배열에 정렬을 적용 0 ");
		for (int i : sortedArr) {
			System.out.print(i+" ");		//10 5 2 3 4  로 출력됨. 왜냐면 배열을 복사해서 그걸 
		}
		System.out.println();
		
		//comparator 쓰려면 클래스타입이어야 함. 
		
		System.out.println("-내림차순 정렬");
		//boxed()
		//sorted( (a,b) -> b-a ) 내부적에선 comparator 가 사용됨.
		//우리가 원래 int배열로 해줬기 때문에, 클래스는 인터페이스 구현 가능하지만 인트는 구현 불가능함. 그래서 
		//배열의 요소들을 int -> Integer 클래스로 바꿔주는 과정을 거져야 함. //(a,b) -> b-a 라고 쓸거기 때문에. 
		//그 후에 정렬조건을 바꿔주는 것임. 
		Object[] reversedArr = Arrays.stream(arr).boxed().sorted( (a,b) -> b-a ).toArray();
		for (Object obj : reversedArr) {
			System.out.print( (Integer) obj +" ");
		}
		System.out.println();
		
		
		
		//sorted + forEach
		System.out.println("정렬과 반복을 동시에");
		Arrays.stream(arr).sorted().forEach( (n) -> System.out.print(n+" "));
		
		
		
	}
}
