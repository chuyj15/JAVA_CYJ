package Day11.Ex02_Util;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {
	public static void main(String[] args) {
		//정렬되지 않는 배열요소들
		Integer[] arr = {5,3,4,1,2};
		
		//배열을 정렬(sort) - 오름차순
		Arrays.sort(arr);		//sort() 들어가면 퀵정렬로 되어있음. 
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//배열을 정렬(sort) - 내림차순
		Arrays.sort( arr, Collections.reverseOrder() );
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//100개의 랜덤 수를 배열요소로 갖는 배열
		int[] random = new int[100];
		//1~100 사이의 랜덤 수를 배열요소로 갖는 배열
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 100 +1);
		}
		
		Arrays.sort(random);
		
		for (int i = 0; i < random.length; i++) {
			System.out.print(random[i]+" ");
		}
		System.out.println();
		
		//Arrays.binarySearch(배열, 찾을 값)
		//이진탐색(검색) 알고리즘을 사용하여 검색한 후, 
		//해당 값이 있으면, 그 위치(index)를 반환
		//찾지 못했으면, ( -(insertion point)-1 ) 음수를 반환
		if ( Arrays.binarySearch(random, 20)<0 ) {
			System.out.println("랜덤 수 20이 없습니다.");
			System.out.println( "Insertion point: "+ Arrays.binarySearch(random, 20) );
		} else {
			System.out.println("index: "+Arrays.binarySearch(random, 20));
		}
		
		//Arrays.fill(값) : 값으로 모든 배열요소를 채우는 메소드
		int fill[] = new int[10];
		
		Arrays.fill(fill, 8);
		for (int i = 0; i < fill.length; i++) {
			System.out.print(fill[i]+" ");
		}
		System.out.println();
		
		//Arrays.copyOf(배열, 길이);
		//: 배열을 앞에서부터 (길이) 개의 요소를 복사하여 배열로 반환
		int copy[] = Arrays.copyOf(fill, 3);
		//8 8 8 8 8  8 8 8 8 8
		//8 8 8 을 복사해옴
		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		
		//Arrays.copyOfRange(배열, 시작index, 끝index+1);
		//: 배열을 시작index부터 끝index까지 요소를 복사하여 배열로 반환
//		int copyRange[] = Arrays.copyOfRange(arr, 2, 4);	//int[]배열을 받아와야하는데 arr가 Integer로 되어있음. 
		//질문) 저번에 Integer랑 int랑 자유롭게 사용가능하다고 했는데 왜 이번에는 안되는거지..?
		// Integer = int	  (O)
		// int = Integer	  (O)
		// int[] = Integer[]  (X)
		// Integer[] = int[]  (X)
		int copyRange[] = Arrays.copyOfRange(random,11, 21);	//11~20
		for (int i = 0; i < copyRange.length; i++) {
			System.out.print(copyRange[i]+" ");
		}
		System.out.println();
		
	}
}
