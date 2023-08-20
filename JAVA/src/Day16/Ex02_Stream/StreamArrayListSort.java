package Day16.Ex02_Stream;

import java.util.ArrayList;
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

		// collect() : 중간연산한 스트림을 컬렉션으로 반환
		
		System.out.println("정렬 - 오름차순");
		//앞에서 배열을 가지고 정렬할 땐 Arrays.stream(null)을 사용했었음. 
		//list라는 컬렉션을 사용할 때는 stream을 호출해서 가져오면 됨.
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList()); // toList, toSet, toMap
		//궁금한점: 여기서 Comparator은 인터페이스인데 어떻게 import를 안하고 사용할 수 있어?
		//답변: Comparator 인터페이스는 Java에서 기본적으로 제공되는 java.util 패키지에 속해 있습니다. 
		//따라서 코드에서 Comparator를 사용하려면 해당 패키지가 자동으로 임포트되기 때문에 별도의 임포트 문이 필요하지 않습니다. 
		
		for (Integer item : sortedList) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		System.out.println("정렬 - 내림차순");
		List<Integer> reversedList = list.stream()
										 .sorted( Comparator.reverseOrder() )
										 .collect(Collectors.toList());
		
		for (Integer item : reversedList) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		
		// 정렬 + 반복
		// 정렬 - 오름차순
		System.out.println("정렬 - 오름차순");
		list.stream().sorted().forEach( (n) -> System.out.print(n + " ") );
		System.out.println();
		
		// 정렬 - 내림차순
		System.out.println("정렬 - 내림차순");
		list.stream().sorted( Comparator.reverseOrder() ).forEach( (n) -> System.out.print(n + " ") );
		System.out.println();
		
	}

}








