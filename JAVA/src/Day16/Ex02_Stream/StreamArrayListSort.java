package Day16.Ex02_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamArrayListSort {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(4);
		
		
		
		//collect() : 중간연산한 스트림을 컬렉션으로 반환
		//오름차순
		List<Integer> sortedList = list.stream().sorted().collect( Collectors.toList() );	//toList, toSet, toMap
		for (Integer item : sortedList) {
			System.out.print(item + " ");
		}
//		sortedList.stream().sorted().forEach((n) -> System.out.print(n+" "));
		System.out.println();

		
		//내림차순
		System.out.println("정렬 - 내림차순");			//리스트의 요소가 Integer, String 과 같은 직접 비교할 때는 Comparator.reverseOrder(), 아니면 .reversed()
		List<Integer> reversedList = list.stream().sorted( Comparator.reverseOrder() ).collect( Collectors.toList() );
		for (Integer item : reversedList) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		
		
		//정렬 + 반복
		//정렬 - 오름차순
		System.out.println("정렬 - 오름차순");
		list.stream().sorted().forEach((n) -> System.out.print(n+" "));
		System.out.println();
		
		//정렬 - 내림차순
		System.out.println("정렬 - 내림차순");
		list.stream().sorted(  Comparator.reverseOrder()  ).forEach( (n) -> System.out.print(n+" ") );
//		list.stream().sorted(  (a,b) -> b-a  ).forEach( (n) -> System.out.print(n+" ") );
		System.out.println();
		
		
		
		
		
	}
}
